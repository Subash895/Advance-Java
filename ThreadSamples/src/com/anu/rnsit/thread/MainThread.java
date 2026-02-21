package com.anu.rnsit.thread;

class MyThread implements Runnable{
	Thread th1;
	public MyThread () {
		th1=new Thread(this,"child Thread" );
		System.out.println("Child thread : "+ th1);
		th1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("entering Child Thread....");
		System.out.println("Exectuing  Child Thread....");
		System.out.println("exiting Child Thread....");
	}
	
}
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering the main thread");
		System.out.println("about to invoke child thread ");
		MyThread mt1 =new MyThread();
		System.out.println("back in the maim thread ");
		System.out.println("we finihed cild thread functionality");
		System.out.println("execting main thread");
		
	}

}
