package com.anu.rnsit.thread;

class MyThread2 implements Runnable{
	Thread th1;
	public MyThread2() {
		th1=new Thread(this,"child Thread");
		th1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("Child thread loop "+(i+1));
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadJoinSample {
public static void main(String[] args)  {
	System.out.println("in the main thread ");
	System.out.println("about to incoke child thread ");
	MyThread2 mt3=new MyThread2();
	try {
		mt3.th1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for (int i=0;i<5;i++) {
		System.out.println("Main thread loop  "+(i+1));
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	System.out.println("Exiting Main Thread ...");
}
}
