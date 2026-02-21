package com.anudip.Assing56;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Original list: " + list);

        // Using Collections class to reverse
        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }
}