package world_happiness_index.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import world_happiness_index.domain.WorldIncomeIndex;

/**
 * DDL functions performed in database
 */
public class WorldIncomeIndexDao {

	public static WorldIncomeIndex findByCountry(String countryName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldIncomeIndex entity1 = new WorldIncomeIndex();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
		    String sql = "select * from world_income_index where country = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,countryName);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String country = resultSet.getString("country");
		    	if(country.equals(countryName)){
		    		entity1.setContinent(resultSet.getString("continent"));
		    		entity1.setCountry(country);
		    		entity1.setAvg_income(Integer.parseInt(resultSet.getString("avg_income")));
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
	
	public void add(WorldIncomeIndex form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "insert into world_income_index(avg_income, country, continent) values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql);
		    preparestatement.setInt(1,form.getAvg_income());
		    preparestatement.setString(2,form.getCountry());
		    preparestatement.setString(3,form.getContinent());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
/*	public void update(WorldVaccinationInfo form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "UPDATE entity1 SET password = ?, email = ? where username = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getPassword());
			preparestatement.setString(2,form.getEmail());
		    preparestatement.setString(3,form.getUsername());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "Loading@123");
			
			String sql = "delete from entity1 where username = ?";
			System.out.println(username);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	*/
}
