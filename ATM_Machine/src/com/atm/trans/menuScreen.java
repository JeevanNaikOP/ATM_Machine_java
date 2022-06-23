package com.atm.trans;

import java.util.Scanner;

public class menuScreen extends Account {
    Scanner menuInput=new Scanner(System.in);
	public void welcome() {
		System.out.println("Welcome to login page");
		System.out.println("Enter the customer number : ");
		setCustomerNumber(menuInput.nextInt());
	    System.out.println("Enter the Password : ");
	    setPassword(menuInput.next());

	}
}
