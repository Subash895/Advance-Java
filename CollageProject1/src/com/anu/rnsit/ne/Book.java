package com.anu.rnsit.ne;

public class Book {
	
	private String bookName ;
	private int bookId;
	private String authorName;
	
	//used private to use by getter and setters (it will be more only way for private, secure and encrypted well)
	
	public Book(int bookId, String bookName, String authorName) {
	    this.bookId=bookId;
	    this.bookName=bookName;
	    this.authorName=authorName;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public String toString() {
		return "Book [bookName: " + bookName + ", bookId: " + bookId + ", authorName: " + authorName + "]";
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
