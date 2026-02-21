package com.anu.rnsit.ne;

import java.util.Scanner;

public class ArrayBoundaryDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        try {

            System.out.println("Displaying elements:");

            // Intentionally accessing beyond last index
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index out of bounds.");
        }

        input.close();
    }
}