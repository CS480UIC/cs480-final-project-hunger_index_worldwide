package world_body_fat_percentage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import world_body_fat_percentage.domain.WorldBodyFatPercentage;

/**
 * DDL functions performed in database
 */
public class WorldBodyFatPercentageDao {
	/**
	 * user name to connect to the database 
	 */
	private static String MySQL_user = "hunger_world_statistics";  //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "hunger123";  //TODO change password
// updated variables
	public static WorldBodyFatPercentage findBybody_fat_percentage(String bfp) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldBodyFatPercentage body_f_p = new WorldBodyFatPercentage();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
		    String sql = "select * from world_body_fat_percentage where country=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,bfp);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String bfp_1 = resultSet.getString("country");
		    	if(bfp_1.equals(bfp)){
		    		body_f_p.setBody_fat_percentage(Float.parseFloat(resultSet.getString("body_fat_percentage")));
		    		body_f_p.setCountry(bfp_1);
		    		body_f_p.setContinent(resultSet.getString("continent"));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return body_f_p;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(WorldBodyFatPercentage form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "insert into world_body_fat_percentage values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setFloat(1,form.getBody_fat_percentage());
		    preparestatement.setString(2,form.getCountry());
		    preparestatement.setString(3,form.getContinent());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(WorldBodyFatPercentage form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "UPDATE world_body_fat_percentage SET body_fat_percentage = ?, continent = ? where country = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setFloat(1,form.getBody_fat_percentage());
		    preparestatement.setString(2,form.getContinent());
		    preparestatement.setString(3,form.getCountry());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
//	
	public void delete(String cnt) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "delete from world_body_fat_percentage where country = ?";
			System.out.println(cnt);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,cnt);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
