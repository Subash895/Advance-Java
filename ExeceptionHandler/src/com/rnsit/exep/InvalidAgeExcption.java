package com.rnsit.exep;


public class InvalidAgeExcption extends Exception{
	String string;
	String Message;
	public InvalidAgeExcption(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	public void invalidExcpton(String Message) {
			this.Message=Message;
	}

}
