package com.acemusicstore.customer;

import com.acemusicstore.wallet.Wallet;
import java.util.ArrayList;
import java.util.Scanner;

import com.acemusicstore.Employee;
import com.acemusicstore.Recording;


public class PrimaryAccount {
	public Integer id;
	public String pass;
	public String name;
	public String user;
	public String address;
	public String state;
	private boolean hasSecondary;
	private Integer secondaryID; 
	
	public PrimaryAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public PrimaryAccount(String name, String user, String address, String state, String music_pref) {
		 setUsername(name);
		 setPassword(pass);
		 setPassword(pass);
	}
	
	
	public void setUsername(String name) {
		this.name = name;
	}
	
	public void setPassword(String pass) {
		this.pass = pass;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
	
	
	public String getUsername() {
		return this.name;
	}
	
	
	public String getPassword() {
		return this.pass;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public static void registerAccount(String name, String pass, String address, String state) {
		
	}
	
	
	
	protected static Recording purchase() {
		Wallet w = new Wallet();
		int balance = w.getBalance(); 								//check wallet balance
		Recording rec = new Recording();
		ArrayList <Recording> selection = Recording.viewallDb(); 	//choose recording
		String [][] array = new String [selection.size()][];		//convert to an array
		selection.toArray(array);									//send to AppUI presentation for selection
		for (String [] e : array) {				
			System.out.println(e);
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Please make your selection. Press a number from 1 to" + array.length + "OK. \n");
		int item = s.nextInt();
		String cost = array[item][7];
		//String [] recording = array[item];
		//Integer cost = (Integer) selection.get(7); 
		int c = Integer.parseInt(cost);
		if (c > balance) {
			System.out.println("You do not have sufficient funds to make purchase. Please choose another item from store. Thank you!");
			System.out.println();									// optional, send back to AppUI to get recording cost from array list
		} else {
			System.out.println("Thank you for your purchase");
			int new_balance = w.deductFund(c);
			w.setBalance(new_balance);
		}
		s.close();
		System.out.println(array[item]);
		return rec;													//return recording
	}
}
