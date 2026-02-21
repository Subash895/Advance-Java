package com.anudip.rnsit;

public class Bank {
	double amount;
	Bank(double amount){
		this.amount=amount;
	}
	void withDraw(double withdrawAmount) {
		if(withdrawAmount<=amount) {
			System.out.println("With Draw Successfull");
			}else {
				System.out.println("With Draw Unsucessfull");
			}
	}
	 void deposit(double depositAmount) {
		 amount=amount+depositAmount;
		 System.out.println("DepositSucessfull Amount is  "+depositAmount);
	 }
	 void displayBalance() {
		 System.out.println("The bank balance is  "+amount);
	 }

}
