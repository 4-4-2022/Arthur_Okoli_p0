package com.acemusicstore.dbaccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Account {

	private String url = System.getenv("db_url");
	private String user = System.getenv("db_user");
	private String pass = System.getenv("db_pass");
	public Connection postgres;
	
	private String username;
	private String password;
	
	public void connect() {
		try {
		postgres = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
