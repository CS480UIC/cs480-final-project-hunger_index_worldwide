package init.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import user.domain.User;



/**
 * DDL functions performed in database
 */
public class InitDao {
	
	/**
	 * user name to connect to the database 
	 */
	private static String MySQL_user = "hunger_world_statistics";  //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private static String MySQL_password = "hunger123";  //TODO change password
	
	/**
	 * get the Search result with Username 
	 */
	public User findByUsername(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		User user = new User();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
		    String sql = "select * from user where username=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    ResultSet resultSet = preparestatement.executeQuery();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("username");
		    	if(user_name.equals(username)){
		    		user.setUsername(resultSet.getString("username"));
		    		user.setPassword(resultSet.getString("password"));
		    		user.setEmail(resultSet.getString("email"));
		    		
		    	}
		    }
		
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return user;
	}
	

	
	
	/**
	 * insert User
	 */
	public void add(User user) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			
			String sql = "insert into user values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,user.getUsername());
		    preparestatement.setString(2,user.getPassword());
		    preparestatement.setString(3,user.getEmail());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide",MySQL_user, MySQL_password);
			String sql = "select * from user";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				User user = new User();
				user.setUsername(resultSet.getString("username"));
	    		user.setPassword(resultSet.getString("password"));
	    		user.setEmail(resultSet.getString("email"));
	    		list.add(user);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
		
	public void initialize() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hunger_index_worldwide?allowMultiQueries=true",MySQL_user, MySQL_password);
			String sql = "create database if not exists hunger_index_worldwide ; "
					+ "use hunger_index_worldwide; "
					+ "drop table if exists world_hunger_statistics; "
					+ "create table world_hunger_statistics ("
					+ "user_id INT PRIMARY KEY, "
					+ "avg_income INT NOT NULL, "
					+ "vaccination_rate FLOAT NOT NULL, "
					+ "death_rate FLOAT NOT NULL, "
					+ "happiness_index FLOAT NOT NULL, "
					+ "unemplyment_rate FLOAT NOT NULL, "
					+ "body_fate_percentage FLOAT NOT NULL, "
					+ "date_added Date "
					+ "); "
					+ " "
					+ " "
					+ "drop table if exists world_body_fat_percentage; "
					+ "create table world_body_fat_percentage ( "
					+ "body_fat_percentage FLOAT NOT NULL, "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ "); "
					+ " "
					+ " "
					+ "drop table if exists world_death_rate; "
					+ " "
					+ "create table world_death_rate ( "
					+ "death_rate FLOAT NOT NULL , "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ " "
					+ "); "
					+ " "
					+ " "
					+ " "
					+ "drop table if exists world_happiness_index; "
					+ " "
					+ "create table world_happiness_index ( "
					+ "happiness_index FLOAT NOT NULL, "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ "); "
					+ " "
					+ " "
					+ " "
					+ "drop table if exists world_income_index; "
					+ " "
					+ "create table world_income_index ( "
					+ "avg_income INT NOT NULL, "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ "); "
					+ " "
					+ "drop table if exists world_unemployment_rate; "
					+ " "
					+ "create table world_unemployment_rate( "
					+ "unemployment_rate FLOAT NOT NULL, "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ "); "
					+ " "
					+ "drop table if exists world_vaccination_info; "
					+ " "
					+ "create table world_vaccination_info( "
					+ "vaccination_rate FLOAT NOT NULL UNIQUE, "
					+ "country VARCHAR(30) PRIMARY KEY, "
					+ "continent VARCHAR(30) NOT NULL "
					+ "); "
					+ " "
					+ " "
					+ " "
					+ "drop table if exists user; "
					+ " "
					+ "CREATE TABLE user "
					+ "( "
					+ "   "
					+ "  username VARCHAR(50) primary key, "
					+ "  `password` VARCHAR(50) NOT NULL, "
					+ "  email VARCHAR(50) NOT NULL "
					+ "); "
					+ " "
					+ " "
					+ "drop table if exists entity1; "
					+ " "
					+ "CREATE TABLE entity1  "
					+ "( "
					+ "   "
					+ "  username VARCHAR(50) primary key, "
					+ "  `password` VARCHAR(50) NOT NULL, "
					+ "  email VARCHAR(50) NOT NULL "
					+ ");";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}