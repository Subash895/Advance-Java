package com.anu.rnsit.ne;

import java.util.ArrayList;
import java.util.Scanner;

public class BookAppStore {

	public void insert() {
		ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Book Name (type END to stop):");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("END")) {
                break;
            }// Stops populating if the end is Typed

            int id;

            try {//ID sholud be the Integer else returns to staring 
                System.out.println("Enter Book ID:");
                id = sc.nextInt();
                sc.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Invalid input! ID must be a number.");
                sc.nextLine();
                continue;
            }

            System.out.println("Enter Author Name:");
            String author = sc.nextLine();

            boolean isDuplicate = false;

            
            for (Book b : bookList) {

                // Check if ID OR Name already exists
                if (b.getBookId() == id ||
                    b.getBookName().equalsIgnoreCase(name)) {

                    isDuplicate = true;
                    break;
                }
                
            }

            if (isDuplicate) {
                System.out.println("Duplicate ID or Book Name! Enter again.");
                continue;
            }

            Book newBook = new Book(id, name, author);
            bookList.add(newBook);
            
        	}// while

        	if (bookList.isEmpty()) {
            System.out.println("No Book Entry Found.");
        	} else {
            System.out.println("\n----- Book List -----");
            for (Book b : bookList) {
                System.out.println(b);
            }
        }
        	
        System.out.println(" Last Book Entry");
        sc.close();
	}
    public static void main(String[] args) {
    	BookAppStore insertValue=new BookAppStore();
    	insertValue.insert();
        
    }
}
