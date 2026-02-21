package com.anu.rnsit;

public interface Account extends CreditCardAccount,DebitCardAccount{
	public void createAccount();
	public void closeAccount();
	public default void suspended() {
		System.out.println(" Account Suspeded");
	}
}
