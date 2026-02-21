package com.anudip.Assing56;

import java.util.HashSet;

public class UnionTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating first set
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        // Creating second set
        HashSet<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("date");
        set2.add("fig");

        // Creating union set
        HashSet<String> unionSet = new HashSet<>();

        // Adding all elements of set1
        unionSet.addAll(set1);

        // Adding all elements of set2
        unionSet.addAll(set2);

        System.out.println("Union of sets: " + unionSet);

        // Checking if unionSet contains all elements of set1
        if (unionSet.containsAll(set1)) {
            System.out.println("unionSet is a superset of set1");
        } else {
            System.out.println("unionSet is NOT a superset of set1");
        }
	}

}
