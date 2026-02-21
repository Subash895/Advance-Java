package com.anu.rnsittt;

public class Bank {
	double amount;
	Bank(double amount){
		this.amount=amount;
	}
	void withDraw(double withdrawAmount) {
		
		//We can Use the ------(condition)?True:False;-----
		// String Message =(withdrawAmount<=amount)?"With Draw Successfull":"With Draw Unsucessfull";
		//System.out.println(Message);
		
		if(withdrawAmount<=amount) {
			System.out.println("With Draw Successfull");
			amount -= withdrawAmount;

			}else {
				System.out.println("With Draw Unsucessfull");
			}
	}
	 void deposit(double depositAmount) {
		 amount+=depositAmount;
		 System.out.println("Deposit Sucessfull and the Amount is  "+depositAmount);
	 }
	 void displayBalance() {
		 System.out.println("The bank balance is  "+amount);
	 }

}

