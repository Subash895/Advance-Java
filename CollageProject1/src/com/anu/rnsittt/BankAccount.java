package com.anu.rnsittt;
import java.util.Scanner;


public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank(10000);
		bank.displayBalance();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Withdraw amount");
		int withDrew=scan.nextInt();
		
		bank.withDraw(withDrew);
//		bank.withDraw(5000);
		bank.displayBalance();
		
		System.out.println("Enter the Deposit amount");
		int deposit=scan.nextInt();
//		bank.deposit(5000);
		bank.deposit(deposit);
		bank.displayBalance();
		scan.close();
	}

}
