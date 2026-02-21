package com.rnsit.clas.exe;

public class DivideSample {
	public void divSample(int num1,int num2) {
		int Sum=num1/num2;
		System.out.println("Result"+Sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideSample ds1=new DivideSample();
		try {
		ds1.divSample(100, 0);
		
		}catch(Exception e){
			e.getMessage();
			System.out.println("Life is Bitch");
		}
	}
}
