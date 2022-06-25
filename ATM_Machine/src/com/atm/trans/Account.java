package com.atm.trans;

import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int password;
	private int checkingBalance=0;
	private int savingBalance=0;
	Scanner input=new Scanner(System.in);
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance += checkingBalance;
	}
	public int getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(int savingBalance) {
		this.savingBalance += savingBalance;
	}
	public void withdrawCheckingBalance(int checkingBalance) {
		this.checkingBalance -= checkingBalance;
	}

}
