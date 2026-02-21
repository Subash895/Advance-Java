package com.rnsit.exep;

public class Recruitment {
	public void checkAge(int age) {

	}
	public void checkAges(int Age) throws InvalidAgeExcption {
		System.out.println("AGe Serutiny Started");
		if ((Age<20)||(Age>30)) {
			throw new InvalidAgeExcption("Sorry Bitchs");
		}
		System.out.println("age is "+Age+" Valid Age ");
		System.out.println("AGe jAFDlkaslfkjagsfldk;a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recruitment started");
		Recruitment rc =new Recruitment();
		
		try
		{
			rc.checkAge(18);
			rc.checkAge(32);
			rc.checkAge(24);
			rc.checkAge(35);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Recruitment completed");	
	}

}
