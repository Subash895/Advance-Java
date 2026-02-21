package com.anu.rnsit.ne;
import java.util.Scanner;

public class ArrayExcpPro {

    public static void main(String[] args) {

        // Scanner to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking to enter size of array
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        // array with given size
        int[] numbers = new int[size];

        // Taking array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        try {

           
            // But here loop runs till size (<= size)
            // So it will cause ArrayIndexOutOfBoundsException

            System.out.println("Accessing array elements:");

            for (int i = 0; i <= size; i++) {  // This will cause error
                System.out.println("Element: " + numbers[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            // Catching the exception and printing message
            System.out.println("Exception Caught!");
            System.out.println("You tried to access an index beyond the array limit.");
        }

        // Closing scanner
        sc.close();
    }
}
