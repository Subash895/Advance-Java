package com.anu.rnsit;

public class MyAccount implements Account,InsuranceAccount {

	@Override
	public void calculateRedemptionPoints() {
		// TODO Auto-generated method stub
		System.out.println("RedemptionPoints Calculated");
	}

	@Override
	public void calculateOutstandingAmt() {
		// TODO Auto-generated method stub
		System.out.println("OutstandingAmt calculated");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited the ammount");
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println(" The ammount has withdrawed");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("The Balance of the account is ");
	}

	@Override
	public void openPolicy() {
		// TODO Auto-generated method stub
		System.out.println("The policy Of the Banks To Account");
	}

	@Override
	public void terminalPolicy() {
		// TODO Auto-generated method stub
		System.out.println("Terminal the account");
	}

	@Override
	public void calculatePremiu() {
		// TODO Auto-generated method stub
		System.out.println("Calculating the premimum");
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Create the account ");
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close the account ");
	}
	
	public static void main(String[]args) {
		System.out.println("My Account");
		MyAccount myacc= new MyAccount();
		myacc.calculateOutstandingAmt();
		myacc.calculatePremiu();
		myacc.calculateRedemptionPoints();
		myacc.checkBalance();
		myacc.closeAccount();
		myacc.createAccount();
		myacc.deposit();
		myacc.openPolicy();
		myacc.withDraw();
		myacc.terminalPolicy();
	}
	
}
