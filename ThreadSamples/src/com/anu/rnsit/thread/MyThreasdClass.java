package com.anu.rnsit.thread;

class MyThread1 extends Thread{
	public MyThread1() {
		System.out.println(" Child Thread:"+this);
		
	}
	public void run() {
		System.out.println("entering child Thread ");
		System.out.println("executing the child thread");
		System.out.println("exiting the child Thread");
	}
}
public class MyThreasdClass{
	public void main(String[] args) {
		System.out.println("Entering the main thread");
		System.out.println("about to invoke child thread ");
		MyThread1 mt =new MyThread1();
		System.out.println("back in the maim thread ");
		System.out.println("execting main thread");
	}
}
