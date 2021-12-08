package world_happiness_index.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import world_happiness_index.domain.WorldHappinessIndex;

/**
 * DDL functions performed in database
 */
public class WorldHappinessIndexDao {

	public static WorldHappinessIndex findByCountry(String countryName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldHappinessIndex entity1 = new WorldHappinessIndex();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
		    String sql = "select * from world_happiness_index where country = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,countryName);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String country = resultSet.getString("country");
		    	if(country.equals(countryName)){
		    		entity1.setContinent(resultSet.getString("continent"));
		    		entity1.setCountry(country);
		    		entity1.setHappiness_index(Float.parseFloat(resultSet.getString("happiness_index")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return entity1;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(WorldHappinessIndex form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "insert into world_happiness_index(happiness_index, country, continent) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql);
		    preparestatement.setFloat(1,form.getHappiness_index());
		    preparestatement.setString(2,form.getCountry());
		    preparestatement.setString(3,form.getContinent());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(WorldHappinessIndex form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "UPDATE world_happiness_index SET happiness_index = ?, continent = ? where country = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setFloat(1,form.getHappiness_index());
			preparestatement.setString(2,form.getContinent());
		    preparestatement.setString(3,form.getCountry());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	public void delete(String cnty) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "delete from world_happiness_index where country = ?";
			System.out.println(cnty);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,cnty);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static List<Object> findc3() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide", "root", "Loading@123");
			String sql = "SELECT country, continent "
						 + "FROM world_happiness_index "
						 + "WHERE happiness_index > 7.00"
						 + "ORDER BY country;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				WorldHappinessIndex Q3 = new WorldHappinessIndex();
				
				Q3.setCountry(resultSet.getString("country"));
				Q3.setContinent(resultSet.getString("continent"));
	    		list.add(Q3);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}
	
}
