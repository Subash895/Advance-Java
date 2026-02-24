package com.pack.multithread;
class MyClass{
	public void call() {
		System.out.println("Produced Goods ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consumer Goods ");
	}
}
class MyThreads implements Runnable{
	MyClass mc;
	Thread th1;
	public MyThreads(MyClass mc) {
		th1 =new Thread(this,"child thread");
//		th1.start();
		this.mc=mc;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		mc.call();
	}
	
}
public class Mulithreadss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyClass mc1 = new MyClass();   // one shared object
		 MyThreads m1=new MyThreads(mc1);
		 MyThreads m2=new MyThreads(mc1);
		 MyThreads m3=new MyThreads(mc1);
	        m1.th1.start();
	        m2.th1.start();
	    }
	}

