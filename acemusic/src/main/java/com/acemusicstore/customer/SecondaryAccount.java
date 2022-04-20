package com.acemusicstore.customer;

import com.acemusicstore.wallet.Wallet;
import java.util.Random;

public class SecondaryAccount extends PrimaryAccount {

	public final int id;
	public String pass;
	public String name;
	public String address;
	public String state;
	
	public SecondaryAccount() {
		// TODO Auto-generated constructor stub
		super();
		Random rn = new Random();
		this.id = rn.nextInt(1000);
	}
	
	public void setName() {
		
	}
	
	public static void registerAccount(String name, String pass, String address, String state) {
		SecondaryAccount newbie = new SecondaryAccount();
		newbie.name = name;
		newbie.pass = pass;
		newbie.address = address;
		newbie.state = state;
		
	}
}
