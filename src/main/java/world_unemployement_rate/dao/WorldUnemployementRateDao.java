package world_unemployement_rate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import world_unemployement_rate.domain.WorldUnemployementRate;

/**
 * DDL functions performed in database
 */
public class WorldUnemployementRateDao {

	public static WorldUnemployementRate findByUsername(String cntry) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldUnemployementRate wdr = new WorldUnemployementRate();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
		    String sql = "select * from world_unemployement_rate where country=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,cntry);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String com_cntry = resultSet.getString("country");
		    	if(com_cntry.equals(cntry)){
		    		wdr.setUnemployment_rate(Float.parseFloat(resultSet.getString("unemployment_rate")));
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
	
	public void add(WorldUnemployementRate form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			
			String sql = "insert into world_unemployement_rate values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setFloat(1,form.getUnemployment_rate()
		    		);
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
	public void update(WorldUnemployementRate form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide","root", "0@Afnxn_wxm");
			
			String sql = "UPDATE world_unemployement_rate SET unemployment_rate = ?, continent = ? where country = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setFloat(1,form.getUnemployment_rate());
			preparestatement.setString(3,form.getContinent());
		    preparestatement.setString(2,form.getContinent());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
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
