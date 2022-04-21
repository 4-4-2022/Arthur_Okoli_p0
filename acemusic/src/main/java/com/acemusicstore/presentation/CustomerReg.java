package com.acemusicstore.presentation;

import java.util.Scanner;

import com.acemusicstore.customer.PrimaryAccount;

public class CustomerReg {

	public static void registerCust() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please provide your name firstname lastname: \n");
		String name = s.nextLine();
		System.out.println("Please enter a username: \n");
		String user = s.nextLine();
		System.out.println("Please enter your address: \n");
		String address = s.nextLine();
		System.out.println("Please enter your state: \n");
		String state = s.nextLine();
		System.out.println("Please enter one main music category preference - we have Live Recording(1), Mixtape(2) or Studio(3): \n");
		int m_cat = s.nextInt();
		if (m_cat == 1) {
			String music_pref = new String("Live Recording");
			new PrimaryAccount(name, user, address, state, music_pref);
			}
			else if (m_cat == 2) {
			String music_pref = "Mixtape";
			new PrimaryAccount(name, user, address, state, music_pref);
			}
			else {
			String music_pref = new String("Studio");
			new PrimaryAccount(name, user, address, state, music_pref);
			}
		s.close();
		return;
	}
	
}
