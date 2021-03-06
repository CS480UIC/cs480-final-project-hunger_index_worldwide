package world_income_index.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import world_income_index.domain.WorldIncomeIndex;

/**
 * DDL functions performed in database
 */


public class WorldIncomeIndexDao {
	
	/**
	 * user name to connect to the database 
	 */
	private static String MySQL_user = "hunger_world_statistics";  //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private static String MySQL_password = "hunger123";  //TODO change password

	public static WorldIncomeIndex findByCountry(String countryName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		WorldIncomeIndex entity1 = new WorldIncomeIndex();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
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
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
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
	
	
	public void update(WorldIncomeIndex form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "UPDATE world_income_index SET avg_income = ?, continent = ? where country = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getAvg_income());
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
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "delete from world_income_index where country = ?";
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
	
	
//	public List<Object> findRecipientIncome() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
//		List<Object> list = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide", MySQL_user, MySQL_password);
//			String sql = "select * from world_income_index where country = ?";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//			ResultSet resultSet = preparestatement.executeQuery();			
//			while(resultSet.next()){
//				WorldIncomeIndex entity1 = new WorldIncomeIndex();
//				entity1.setTotal_net(resultSet.getInt("total_net"));
//	    		
//	    		list.add(entity1);
//			 }
//			connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//		return list;
//		
//	}
	
}
