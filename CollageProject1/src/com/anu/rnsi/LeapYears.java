package com.anu.rnsi;
import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter The Year You want Check if its a leap year");
		int year=Scan.nextInt();
//		If the Year is Modules by 400 is Zero means Leap year ||  Year is modules by 4 And modules by 100 is not 0 then its Leap year 
		if ((year%400==0)||(year%4==0 &&year%100!=0)) {
			System.out.println(" Entered "+year+" year is a Leap Year");
		}else {
			System.out.println("Entered "+year+" year is not a Leap Year");
		}
		Scan.close();
	}

}
