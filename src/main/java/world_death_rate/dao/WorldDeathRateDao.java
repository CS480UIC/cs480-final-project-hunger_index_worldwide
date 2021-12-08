package world_death_rate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import world_body_fat_percentage.domain.WorldBodyFatPercentage;

//import java.util.ArrayList;
//import java.util.List;

import world_death_rate.domain.WorldDeathRate;

/**
 * DDL functions performed in database
 */
public class WorldDeathRateDao {

	public static WorldDeathRate findByUsername(String cntry) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldDeathRate wdr = new WorldDeathRate();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
		    String sql = "select * from world_death_rate where country=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,cntry);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String com_cntry = resultSet.getString("country");
		    	if(com_cntry.equals(cntry)){
		    		wdr.setDeath_rate(Float.parseFloat(resultSet.getString("death_rate")));
		    		wdr.setCountry(com_cntry);
		    		wdr.setContinent(resultSet.getString("continent"));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return wdr;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(WorldDeathRate form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			
			String sql = "insert into world_death_rate values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setFloat(1,form.getDeath_rate());
		    preparestatement.setString(2,form.getCountry());
		    preparestatement.setString(3,form.getContinent());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
//	
//	
	public void update(WorldDeathRate form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			
			String sql = "UPDATE world_death_rate SET death_rate = ?, continent = ? where country = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setFloat(1,form.getDeath_rate());
			preparestatement.setString(2,form.getContinent());
		    preparestatement.setString(3,form.getCountry());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
//	
//	
	public void delete(String cnty) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			
			String sql = "delete from world_death_rate where country = ?";
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
	
	public List<Object> findCC() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			String sql = "select country, continent "
					+ "from world_death_rate "
					+ "where death_rate > 12.00 "
					+ "order by continent;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				
				WorldDeathRate bf = new WorldDeathRate();
				
				bf.setCountry(resultSet.getString("country"));
				bf.setContinent(resultSet.getString("continent"));
				

	    		list.add(bf);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
