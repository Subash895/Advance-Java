package com.anudip.Assing56;
import java.util.HashSet;


public class AppendElementHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Creating a HashSet of String type
        HashSet<String> fruits = new HashSet<>();

        // Adding elements using add() method
        fruits.add("banana");
        fruits.add("date");
        fruits.add("apple");

        // Appending one more element
        fruits.add("cherry");

        // Displaying updated HashSet
        System.out.println("Updated HashSet: " + fruits);
	}

}
