package com.anudip.Assing56;

import java.util.ArrayList;

public class BookApp {
	 public static void main(String[] args) {

	        // Creating ArrayList of Book type
	        ArrayList<BookClass> bookList = new ArrayList<>();

	        // Adding Book objects
	        bookList.add(new BookClass(101, "Let us C", "Yashavant P Kanetkar"));
	        bookList.add(new BookClass(102, "Head First Java", "Kathy Sierra"));

	        System.out.println("---- All Books ----");

	        // Using advanced for loop
	        for (BookClass b : bookList) {
	            System.out.println(b);
	        }
	    }
}
