package world_death_rate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




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
//	public void update(WorldDeathRate form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		System.out.println("Now going to update");
//		System.out.println(form);
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore","test", "12345678");
//			
//			String sql = "UPDATE entity1 SET password = ?, email = ? where username = ?;";
//			System.out.println("Update Executed");
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,form.getPassword());
//			preparestatement.setString(2,form.getEmail());
//		    preparestatement.setString(3,form.getUsername());
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//	
//	
//	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		System.out.println("Now going to delete");
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore","test", "12345678");
//			
//			String sql = "delete from entity1 where username = ?";
//			System.out.println(username);
//			System.out.println("Delete Executed");
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,username);
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
}
