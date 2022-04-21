package com.acemusicstore.presentation;

import com.acemusicstore.customer.PrimaryAccount;
import com.acemusicstore.customer.SecondaryAccount;

public interface Login {

public boolean loginDb(String user, String pass);
public PrimaryAccount viewPAccount(String user, int acct_id);
public SecondaryAccount viewSAccount(String user, int acct_id);
public void presentMenu();
	
}
