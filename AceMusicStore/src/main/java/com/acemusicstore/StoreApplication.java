package com.acemusicstore;
import com.acemusicstore.customer.PrimaryAccount;
import com.acemusicstore.customer.SecondaryAccount;
import com.acemusicstore.*;



public class StoreApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/* We need to firstly login the User, to determine whether it is an Employee or a Customer or 
		 * if this is a potential new User. However, this means we have to initialize the Employee db
		 * and the CustAcct db
		 *
		 */
		Record recording = new Record();
		LiveRecording liveRec = new LiveRecording();
		Mixtape mixtape = new Mixtape();
		PrimaryAccount primary = new PrimaryAccount();
		SecondaryAccount secondary = new SecondaryAccount();
		
		// Initialize database with data (music, employees and customers)
		
		//public void RecordRepositoryImpl();
		
		recording.initDb(10, "solo", "River", 2003, "dubsteppers");
		mixtape.initDb(2, "handsome", "Never felt So Good", 1965, "Greg Gambrell");
		
	}

}
