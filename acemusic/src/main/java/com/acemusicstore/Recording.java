package com.acemusicstore;

import com.acemusicstore.dbaccess.dbConnectImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.List;

public class Recording {

	
	public static Integer id;
	public static String artist;
	public static String song;
	public static String genre;
	public static String category;
	public static Integer year;
	public static int cost = 0;
	public static String producer;
	final String SQLinsert = "insert into recording values(?, ?, ?, ?, ?, ?, ?, ?)";
	final static String SQLview = "select * from recording";
	final String SQLartistview = "select * from recording where artist = ? and year < ?";
	private static final String SQLdelartist = "delete * from recording where artist = ? and year < ?";
	private static final String SQLmodrecord = "update recording set song = ?, year = ?, producer = 'Diplo' where artist = ? and year = ?";
	
	public Recording() {
		
	}
	
	public Recording(Integer id, String artist, String song, String genre, String category, Integer year, Integer cost, String producer) {
		
	}
	
	protected void initMusicDb() {
		String [][] arr = { 
							{"1", "Benny Dykchoff", "Midnight", "Soul", "Record", "1986", "12.99", "Socrates"},
							{"2", "Alan Partridge", "Next Winter", "Folk", "Live Recording", "1990", "14.99", "Sochi"},
							{"3", "Saleem", "Cornucopia", "Jazz", "Live Recording", "1978", "12.99", "Will Hebert"},
							{"4", "J Cole", "The Come Up", "Hip Hop", "Mixtape", "2007", "7.99", "J Cole"},
							{"5", "J Cole", "Forest Hills Drive", "Hip Hop", "Record", "2014", "17.99", "J Cole"},
							{"6", "J Cole", "Forest Hills Drive", "Hip Hop", "Record", "2014", "13.99", "J Cole"},
							{"7", "Masego", "Studying Abroad", "Jazz Fusion", "Record", "2020", "9.99", "FKJ"},
							{"8", "Sade", "Soldier of Love", "Smooth Jazz", "Mixtape", "2011", "15.50", "Mike Pela"}
						};
	}
	
		/*
		 * 
		Connection postgres;
		PreparedStatement stmt = null;
		postgres = dbConnectImpl.connect();
		try {
			stmt = postgres.prepareStatement(SQLinsert);
		
		 
		for (int i=0; arr.length <1; i++) {
			for (String[] e : arr) {
				stmt.setInt(1, Integer.parseInt(e));
				stmt.setString(2, e);
				stmt.setString(3, e);
				stmt.setString(4, e);
				stmt.setString(5, e);
				stmt.setInt(6, Double.parseDouble(e));
				stmt.setInt(7, Double.parseDouble(e));
				stmt.setString(8, e);
				stmt.execute();
				System.out.println(arr[i]);
			} 
			
			
		}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			} finally {
				dbConnectImpl.closeConnection(postgres);
				dbConnectImpl.closeStatement(stmt);
			}
	
	}
	*
	*/
	
	public ArrayList <Recording> viewDb() {
		Connection conn;
		PreparedStatement stmt;
		conn = dbConnectImpl.connect();
		ArrayList <Recording> results = new ArrayList <Recording> ();
		try {
			stmt = conn.prepareStatement(SQLartistview);
			stmt.setString(1, "J Cole");
			stmt.setInt(2, 2010);
			ResultSet rs = stmt.executeQuery(SQLartistview);
			while (rs.next()) {
				rs.getInt("id");
				rs.getString("artist");
				rs.getString("song");
				rs.getString("genre");
				rs.getString("category");
				rs.getInt("year");
				rs.getInt("cost");
				rs.getString("producer");
				results.add(new Recording(id, artist, song, genre, category, year, cost, producer));
				System.out.println(results);
				
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		return results;

	}
	
	
	public static ArrayList <Recording> viewallDb() {
		Connection conn;
		Statement stmt;
		conn = dbConnectImpl.connect();
		ArrayList <Recording> results = new ArrayList <Recording> ();
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQLview);
			while (rs.next()) {
				rs.getInt("id");
				rs.getString("artist");
				rs.getString("song");
				rs.getString("genre");
				rs.getString("category");
				rs.getInt("year");
				rs.getInt("cost");
				rs.getString("producer");
				results.add(new Recording(id, artist, song, genre, category, year, cost, producer));
				System.out.println(results);
				
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		return results;

	}
	
	
	public ArrayList <Recording> delDb() {
		Connection conn;
		PreparedStatement stmt;
		PreparedStatement stmt2;
		conn = dbConnectImpl.connect();
		ArrayList <Recording> results = new ArrayList <Recording> ();
		try {
			stmt = conn.prepareStatement(SQLdelartist);
			stmt.setString(1, "Ben Dyckhoff");
			stmt.setInt(2, 2000);
			stmt.execute(SQLdelartist);
			stmt2 = conn.prepareStatement(SQLview);
			ResultSet updatedDb = stmt2.executeQuery(SQLview);
			while (updatedDb.next()) {
				updatedDb.getInt("id");
				updatedDb.getString("artist");
				updatedDb.getString("song");
				updatedDb.getString("genre");
				updatedDb.getString("category");
				updatedDb.getInt("year");
				updatedDb.getInt("cost");
				updatedDb.getString("producer");
				results.add(new Recording(id, artist, song, genre, category, year, cost, producer));
				System.out.println(results);
				
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		return results;

	}
	
	
	public ArrayList <Recording> updateDb() {
		Connection conn;
		PreparedStatement stmt;
		PreparedStatement stmt2;
		conn = dbConnectImpl.connect();
		ArrayList <Recording> results = new ArrayList <Recording> ();
		try {
			stmt = conn.prepareStatement(SQLmodrecord);
			stmt.setString(1, "Rodeo Drive");
			stmt.setInt(2, 2006);
			stmt.setString(3, "J Cole");
			stmt.setInt(4, 2007);
			stmt.execute(SQLmodrecord);
			stmt2 = conn.prepareStatement(SQLview);
			ResultSet updatedDb = stmt2.executeQuery(SQLview);
			while (updatedDb.next()) {
				updatedDb.getInt("id");
				updatedDb.getString("artist");
				updatedDb.getString("song");
				updatedDb.getString("genre");
				updatedDb.getString("category");
				updatedDb.getInt("year");
				updatedDb.getInt("cost");
				updatedDb.getString("producer");
				results.add(new Recording(id, artist, song, genre, category, year, cost, producer));
				System.out.println(results);
				
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		return results;

	}
}
