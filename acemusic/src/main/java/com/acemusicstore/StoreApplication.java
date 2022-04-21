package com.acemusicstore;
import java.util.Scanner;
import com.acemusicstore.customer.PrimaryAccount;
import com.acemusicstore.customer.SecondaryAccount;
import com.acemusicstore.presentation.C_Transaction;
import com.acemusicstore.presentation.CustomerReg;
import com.acemusicstore.*;



public class StoreApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Welcome, User input to continue - Y or N?
		//Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Ace Music Store \n");
		//String input = s.nextLine();
		C_Transaction ctrans = new C_Transaction();
		int input = ctrans.welcome();
		switch (input) {
		case 1:
			System.exit(0);
		case 2:
			CustomerReg.registerCust();
		case 3:
		}
		
		
		
		/*
		//Initialize Db
		if (input.equalsIgnoreCase("Yes")) {
		Record record = new Record();
		Recording recording = new Recording();
		recording.initMusicDb();
		} else {
			CloseStore.end(s);
		}
		
		//UserInput - Employee, Customer or if this is a potential new User?
		//Customer login, Employee login, or New Customer registration
		
		/*Customer options
		 * a/Register Secondary Account
		 * b/Review Account (default)
		 * c/Purchase
		 * d/Review Wallet
		 * e/Transfer funds 
		 * f/Add funds
		 * g/Withdraw funds
		 * h/Delete Account
		 */
		
		/*Employee options - Asscociates
		 * a/REview Cust accts
		 * b/REview Cust wallet
		 * DElete Cust accts
		 * 
		 * Employee options - Admin
		 * a/ all of above
		 * b/modify Wallet
		 * c/modify Cust accts
		 * d/add Recordings to dB
		 *
		 */
		Record recording = new Record();
		LiveRecording liveRec = new LiveRecording();
		Mixtape mixtape = new Mixtape();
		PrimaryAccount primary = new PrimaryAccount();
		SecondaryAccount secondary = new SecondaryAccount();
		
		// Initialize database with data (music, employees and customers)
		
		//public void RecordRepositoryImpl();
		
		//recording.initDb(10, "solo", "River", 2003, "dubsteppers");
		//mixtape.initDb(2, "handsome", "Never felt So Good", 1965, "Greg Gambrell");
		
	}

}
