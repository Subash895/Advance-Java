package com.anu.rnsit.ne;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAdd {

    public static void main(String[] args) {

        //ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking starting range from user
        System.out.println("Enter Start Number:");
        int start = sc.nextInt();

        // Taking ending range from user
        System.out.println("Enter End Number:");
        int end = sc.nextInt();

        // Adding numbers from start to end into ArrayList
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }

        int sum = 0;

        // Checking for even numbers and adding them
        for (int num : numbers) {
            if (num % 2 == 0) {   // checking even condition using the modules 
                sum += num;
            }
        }

        // Printing Sum
        System.out.println("Sum of Even Numbers: " + sum);

        // Closing scanner
        sc.close();
    }
}
