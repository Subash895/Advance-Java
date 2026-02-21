package com.anu.rnsit.ne;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitOrder {

    public static void main(String[] args) {

        //ArrayList to store fruit names
        ArrayList<String> fruits = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // using While loop to allow user to enter multiple fruits
        while (true) {

            // Asking user to enter fruit name
            System.out.println("Enter Fruit Name (type END to stop):");
            String fruit = sc.nextLine();

            // IF User types END, loop will stop
            if (fruit.equalsIgnoreCase("END")) {
                break;
            }
            fruits.add(fruit);// Adding fruit into ArrayList
        }

        // Displaying fruits in inserted order
        System.out.println("\nFruits in Inserted Order:");
        for (String f : fruits) {
            System.out.println(f);
        }

        // Displaying fruits in reverse order
        System.out.println("\nFruits in Reverse Order:");
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }

        // Closing scanner to ,not to loose the memory
        sc.close();
    }
}
