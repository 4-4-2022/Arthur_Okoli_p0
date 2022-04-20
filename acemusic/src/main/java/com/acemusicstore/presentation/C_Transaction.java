package com.acemusicstore.presentation;

import com.acemusicstore.CloseStore;
import com.acemusicstore.Recording;
import com.acemusicstore.customer.*;
import com.acemusicstore.dbaccess.dbConnectImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class C_Transaction {

	public C_Transaction() {
		// TODO Auto-generated constructor stub
	}

	/*Customer options
	 * a/Welcome greeting--------
	 * a/Register Secondary/Primary Account--------
	 * b/Review Account (default)--------
	 * c/Purchase---------
	 * d/Review Wallet 
	 * e/Transfer funds ++++++
	 * f/Add funds---------
	 * g/Withdraw funds-------
	 * h/Delete Account--------
	 */

	final String SQLinsertacct = "insert into recording values(?, ?, ?, ?, ?, ?, ?, ?)";
	final static String SQLjoinview = "{call ALLIDROWS(?,?)}";
	final String SQLprimeview = "{call PIDROWS(?,?)}";
	final String SQLsecview = "{call SIDROWS(?,?)}";
	private static final String SQLdelacct = "delete * from primary and secondary where username = ? or custid = ?";
	private static final String SQLmodacct = "update secondary set song = ?, year = ?, producer = 'Diplo' where artist = ? and year = ?";
	
	
	public int welcome() {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Ace's Music Store. Please select 1) Login 2) Create a new Account 3) Employee login \n");
		int route = s.nextInt();
		return route;
	}
	
	public boolean regAccount() {
		Scanner s = new Scanner(System.in);
		System.out.println("If you would like to register a Secondary account, please enter yes or no");
		String route = s.nextLine();
		if (route.contains("yes")) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please type your password:");
			String pass = input.nextLine();
			System.out.println("Please type your name: firstname, lastname \n");
			String name = input.nextLine();
			System.out.println("Please type your address: \n");
			String address = input.nextLine();
			System.out.println("Please type your state:  \n");
			String state = input.nextLine();
			input.close();
			SecondaryAccount.registerAccount(name, pass, address, state);
			return true;
		} else return false;
		
	}
	
	
	public ArrayList<PrimaryAccount> revAcct() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can view your account details below; do you want to continue, please enter yes or no \n");
		String more = s.nextLine();
		if (more.equalsIgnoreCase("no")) {
			CloseStore.end(s);
		}
		System.out.println("Please enter your username firstname lastname OR customer_id \n");
		String name = s.nextLine();
		System.out.println("Would you like to view your primary (1), secondary (2) both (3) or Delete account (4): \n");
		int sel = s.nextInt();
		switch (sel) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
		}
		Connection conn;
		CallableStatement stmt;
		conn = dbConnectImpl.connect();
		ArrayList <PrimaryAccount> results = new ArrayList <PrimaryAccount> ();
		try {
			stmt = conn.prepareCall(SQLprimeview);
			stmt.setString(1, "J Cole");
			stmt.setInt(2, 2010);
			ResultSet rs = stmt.executeQuery(SQLprimeview);
			while (rs.next()) {
				rs.getInt("id");
				rs.getString("name");
				rs.getString("pass");
				rs.getString("address");
				rs.getString("state");
				results.add((PrimaryAccount) rs);
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
