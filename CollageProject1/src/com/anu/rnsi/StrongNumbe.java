package com.anu.rnsi;
import java.util.Scanner;
public class StrongNumbe {
 static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
//            System.out.println(fact);   
        }
//        System.out.println(fact);
        return fact;
    }

    static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            //sum=sum+factorial(digit);
            temp /= 10;  
            //temp=temp/10
//          System.out.println(temp+"   "+sum);
        }
        
        return sum == num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if (isStrong(num)) {
            System.out.println(num + " is a strong number");
        } else {
            System.out.println(num + " is not a strong number");
        }

        sc.close();
    }
}

