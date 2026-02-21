package com.anudip.Assing56;

public class BookClass {
	 int bookId;
	    String bookName;
	    String authorName;
		public BookClass(int bookId, String bookName, String authorName) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
		}
		@Override
		public String toString() {
			return "BookClass [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
		}

	    
}
