package com.anudip.rnsit;

public class BankAccount {
	 public void main(String[] args) {
		 Bank bank=new Bank(10000);
		 bank.withDraw(5);
		 bank.deposit(500);
		 bank.displayBalance();
		 
	 }
}
