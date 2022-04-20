package com.acemusicstore.wallet;

public class Wallet {
	
	private int balance = 0;
	static String acctType ="";
	static String custID = "0";
	static int id;
	static boolean linkedPrimary;
	static boolean linkedSecond;
	
	public Wallet() {
		// TODO Auto-generated constructor stub
	}

	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amount) {
		this.balance = amount + balance;
	}
	
	public int deductFund(int amount) {
		balance = balance - amount;
		return balance;
	}
	
	public int addFund(int amount) {
		balance = balance + amount;
		return balance;
	}
	
	public void updateWallet() {
		
	}
	
	public void transferFund(int amount, int fromAcctID, int toAcctID) {
		
	}
	
	public boolean checkTransfer(int amount, int fromCust_id, int toCust_id) {
		int base = getBalance();
		if (base - amount >= 0 ) {
			boolean isAllowed = true;
			return isAllowed;
		} else return false;
	}
}
