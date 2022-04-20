package com.acemusicstore;

import java.util.Scanner;

public final class CloseStore {

	
	public final static void end(Scanner resource) {
		resource.close();
		System.out.println("Thank you for visiting Ace Music Store!!");
	}
}
