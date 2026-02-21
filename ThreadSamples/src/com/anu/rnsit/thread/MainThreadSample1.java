package com.anu.rnsit.thread;

public class MainThreadSample1 {
public static void main(String[] args) {
	Thread myThread =Thread.currentThread();
	System.out.println("mainThread "+myThread); 
	myThread.setName("My main thread");
	System.err.println("Main Thread "+myThread);
	}
}
