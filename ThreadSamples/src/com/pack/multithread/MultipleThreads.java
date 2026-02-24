package com.pack.multithread;

class MyThreadX implements Runnable	{
	Thread th1;
	String tName;
	public MyThreadX(String tName) {
		this.tName=tName;
		th1=new Thread(this,tName);
		System.out.println("Child Tread"+tName);
		th1.start();
	}
	
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(tName+"loop"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class MultipleThreads {

	public static void main(String[] args) {
		MyThreadX mx1= new MyThreadX("childThread1");
		MyThreadX mx2= new MyThreadX("childThread2");
		MyThreadX mx3= new MyThreadX("childThread3");
		for (int i=0;i<5;i++) {
		try {
			System.out.println("main thread loop "+(i+1));
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

}
