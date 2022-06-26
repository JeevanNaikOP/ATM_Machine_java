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
			welcome();
		}

	}
	
	public void getAccountType() {
		System.out.println("Type of your account\n 1.Current account\n 2.Savings account\n 3.Exit");
		int val=menuInput.nextInt();
		switch(val) {
		case 1:
			currentAccount();
			getAccountType();
			break;
		case 2:
			savingAccount();
			getAccountType();
			break;
		case 3:
			System.out.println("Thank you for using ATM");
			break;
		default:
			System.out.println("Please select correct option");
			break;
		}
	}
	
	public void currentAccount() {
		System.out.println("Type of current transaction\n 1.Balance\n 2.Deposit\n 3.Withdraw\n 4.Back");
		int val=menuInput.nextInt();
		switch(val) {
		case 1:
			int res=getCheckingBalance();
			System.out.println("Your current account Balance: "+res);
			currentAccount();
			break;
		case 2:
			System.out.println("Enter ammount to deposit: ");
			res=menuInput.nextInt();
			setCheckingBalance(res);
			currentAccount();
			break;
		case 3:
			System.out.println("Enter ammount to withdraw: ");
			res=menuInput.nextInt();
			withdrawCheckingBalance(res);
			currentAccount();
			break;
		case 4:
			System.out.println("Returning to mainmenu!");
			getAccountType();
			break;
		default:
			System.out.println("Please select correct option");
			break;
		}
	}
	public void savingAccount() {
		System.out.println("Type of saving transaction\n 1.Balance\n 2.Deposit\n 3.Withdraw\n 4.Back");
		int val=menuInput.nextInt();
		switch(val) {
		case 1:
			int res=getSavingBalance();
			System.out.println("Your saving account Balance: "+res);
			savingAccount();
			break;
		case 2:
			System.out.println("Enter ammount to deposit: ");
			res=menuInput.nextInt();
			setSavingBalance(res);
			savingAccount();
			break;
		case 3:
			System.out.println("Enter ammount to withdraw: ");
			res=menuInput.nextInt();
			withdrawSavingBalance(res);
			savingAccount();
			break;
		case 4:
			System.out.println("Returning to mainmenu");
			getAccountType();
			break;
		default:
			System.out.println("Please select correct option");
			break;
		}
	}
}
