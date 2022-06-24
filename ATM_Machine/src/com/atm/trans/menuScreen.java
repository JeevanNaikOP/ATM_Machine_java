package com.atm.trans;

import java.util.HashMap;
import java.util.Scanner;

public class menuScreen extends Account {
	Scanner menuInput=new Scanner(System.in);
	HashMap<Integer,Integer> data=new HashMap<>();
	public void welcome() {
		try {
		data.put(1234,1234);
		data.put(5678, 5678);
		System.out.println("Welcome to login page");
		System.out.println("Enter the customer number : ");
		setCustomerNumber(menuInput.nextInt());
	    System.out.println("Enter the Password : ");
	    setPassword(menuInput.nextInt());
		}
		catch(Exception e){
			System.out.println("\nnvalid Characters \n");
		}
		int cn=getCustomerNumber();
		int pn=getPassword();
		if (data.containsKey(cn) && data.get(cn)==pn){
			getAccountType();
		}
		else {
			System.out.println("Invalid username and password");
		}

	}
	public void getAccountType() {
		System.out.println("Type of your account\n 1.Current account\n 2.Savings account\n 3.Exit");
		int val=menuInput.nextInt();
		switch(val) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("Thank you for using ATM");
			break;
		}
	}
}
