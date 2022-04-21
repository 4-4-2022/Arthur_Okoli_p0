package com.acemusicstore.validation;

import java.util.Scanner;

public class UserInput {
	
	
	
	public static void validatePassword() {
	//	if (input.length() > 2 && input.length() <= 15) return true;
	//	else {
	//		System.out.println("Invalid username, please retry (3-15 characters)");
	//		return false;
		}
	
	public static void validateLogin() {
	//	if (input.length() > 2 && input.length() <= 15) return true;
	//	else {
	//		System.out.println("Invalid username, please retry (3-15 characters)");
	//		return false;
		}
	

	public static int testNumWelcome(int input) {
		if (input > 0 && input <= 3) return input;
		else {
			Scanner s = new Scanner(System.in);
			System.out.println("Invalid selection, please enter 1, 2 or 3: \n");
			input = s.nextInt();
			return input;
			
		}
	}
	
	public static boolean testMusPreference(int input) {
		if (input > 0 && input <= 3) return true;
		else {
			System.out.println("Invalid selection, please enter 1, 2 or 3");
			return false;
		}
	}
	
	public static boolean testUsername(String input) {
				if (input.length() > 2 && input.length() <= 15) return true;
				else {
					System.out.println("Invalid username, please retry (3-15 characters)");
					return false;
				}
	}


}
