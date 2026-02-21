package com.anudip.Assing56;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

    	 // Creating ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
//        // Creating Scanner object to take input from user
//        Scanner sc = new Scanner(System.in);
//
//       
//        System.out.print("Enter how many numbers you want to add: ");
//        int n = sc.nextInt();   // number of elements
//
//        // Taking input from user
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter number " + i + ": ");
//            int num = sc.nextInt();
//            numbers.add(num);   // adding user input into list
//        }
//        sc.close(); // closing scanner
//        
//        
        
        int sum = 0;
        
        numbers.add(2); numbers.add(5); numbers.add(8); numbers.add(10); numbers.add(15);
        
        // Loop through list to find even numbers
        for (int num : numbers) {

            // Checking if number is even
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }

        // Display result
        System.out.println("Sum of even numbers: " + sum);

        
    }
}