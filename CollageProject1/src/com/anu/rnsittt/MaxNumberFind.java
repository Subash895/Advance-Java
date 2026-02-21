package com.anu.rnsittt;
import java.util.Scanner;

public class MaxNumberFind {
//	static Scanner scan=new Scanner(System.in);
	public static void maxNum(int num1,int num2) {
		int max=(num1>num2)?num1:num2;
		// (condition)?True:False;
		System.out.println("The  maximum number between  "+num1+" and "+num2+"  is  "+max);
	}
	
    public static void main(String[] args) {
//    	If the User Enter the either then number he gets the invalid notisfication
//    	Scanner scan=new Scanner(System.in);
//    	it says resourse leak 
    	
//        try {
//            System.out.println("Enter the First Number:");
//            int num1 = scan.nextInt();
//
//            System.out.println("Enter the Second Number:");
//            int num2 = scan.nextInt();
//
//            maxNum(num1, num2);
//         // If the User Enter the either then number he gets the invalid notisfication
//        } catch (Exception e) {
//            System.out.println("Invalid input! Please enter only integers.");
//        }

    	Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter the First Number:");
         int num1 = scan.nextInt();

         System.out.println("Enter the Second Number:");
         int num2 = scan.nextInt();

         maxNum(num1, num2);
         scan.close();    	
 }
}