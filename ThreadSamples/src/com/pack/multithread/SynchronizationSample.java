package com.pack.multithread;

class MyClasses {
    public void call() {
        System.out.println(Thread.currentThread().getName() + " Produced Goods");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Consumer Goods");
    }
}

class MyThreadi implements Runnable {

    MyClasses mc;

    public MyThreadi(MyClasses mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        synchronized (mc) {
            mc.call();
        }
    }
}

public class SynchronizationSample {

    public static void main(String[] args) {

        MyClass obj = new MyClass();   // shared object

        Thread t1 = new Thread(new MyThreads(obj), "Thread-1");
        Thread t2 = new Thread(new MyThreads(obj), "Thread-2");
        Thread t3 = new Thread(new MyThreads(obj), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}