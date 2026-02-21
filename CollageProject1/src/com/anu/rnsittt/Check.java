package com.anu.rnsittt;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter bit position n: ");
        int n = sc.nextInt();
        sc.close();

//        int bitStatus = (num >> n) & 1;   Right Shift
        int bitCheck = (num & (1 << n)) != 0 ? 1 : 0;  // Left shit

        if (bitCheck == 1) {
            System.out.println("The " + n + "th bit is Set (1)");
        } else {
            System.out.println("The " + n + "th bit is Not Set (0)");
        }
//		 If the Bit of the Number Nth bit is 1 then its Set and if its the 0 Then its Not Set
        System.out.println("Binary form: " + Integer.toBinaryString(num));

    }
}
