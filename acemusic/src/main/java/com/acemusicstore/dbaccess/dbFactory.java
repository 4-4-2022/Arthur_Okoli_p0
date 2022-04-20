package com.acemusicstore.dbaccess;
import java.sql.*;
import java.util.Set;

import com.acemusicstore.Employee;
import com.acemusicstore.LiveRecording;
import com.acemusicstore.Mixtape;
import com.acemusicstore.Record;
import com.acemusicstore.customer.PrimaryAccount;
import com.acemusicstore.wallet.Wallet;
	

public abstract class dbFactory {

	public String rec = null;
	public String live_rec = null;
	public String mixt = null;
	
	public abstract Connection connect();
	//public Set <Record> initRecdb();
	//public Set <LiveRecording> initLiveRecdb();
	//public Set <Mixtape> initMixdb();
	//public Set <Employee> initEmpdb(Integer id, String name, String pass, String role, String jobTitle);
	//public Set <PrimaryAccount> initAcctdb(Integer id, String name, String pass, String address, String state);
	//public void registerAcct();
	public abstract boolean loginCustomer(String username, String password);
	public abstract boolean loginEmployee(String username, String password);
	//public Set <PrimaryAccount> viewAcct();
	//public void editAcct();
	//public void delAcct();
	//public void addWallet();
	//public void transferWallet();
	//public void withdrawWallet();
	//public Set <Wallet> viewWallet();
	
}
