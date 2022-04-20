package com.acemusicstore.dbaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Collections;
import com.acemusicstore.*;



public class dbConnectImpl {
	
	private static String url = System.getenv("db_url");
	private static String user = System.getenv("db_user");
	private static String pass = System.getenv("db_pass");
	public static Connection postgres;
	
	//Constructor
	public dbConnectImpl() {
		super();
		}
		
	// Implemented methods
		
	//Connection
	public  static Connection connect() {
		try {
		postgres = DriverManager.getConnection(url, user, pass);
		} 	catch (SQLException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return postgres;
	}
	
	public static void closeConnection(Connection postgres) {
		try {
			postgres.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatement(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		
	public boolean loginCustomer(String username, String password) {
		connect();
		Statement stmt;
		try {
			stmt = postgres.createStatement(); 
		stmt.executeQuery("select username from customer");
		ResultSet rs = stmt.executeQuery("select username from customer");
		while (username != rs.getString("Name") && password != rs.getString("Password")) {
				rs.next();
		} 
		if (username == rs.getString("Name") && password == rs.getString("Password")) {
				System.out.println("Thank you" + username);
				System.out.println("You are now logged in");
		} 
		return true;}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;}
	}
	
	public boolean loginEmployee(String username, String password) {
		connect();
		Statement stmt;
		try {
			stmt = postgres.createStatement(); 
		stmt.executeQuery("select username from employee");
		ResultSet rs = stmt.executeQuery("select username from employee");
		while (username != rs.getString("Name") && password != rs.getString("Password")) {
				rs.next();
		} 
		if (username == rs.getString("Name") && password == rs.getString("Password")) {
				System.out.println("Thank you" + username);
				System.out.println("You are now logged in");
		} 
		return true;}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;}
	}
		
		
		
		
		
		
}
