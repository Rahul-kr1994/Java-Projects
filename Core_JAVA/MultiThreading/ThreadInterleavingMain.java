package com.practice.mulitithreading;

public class ThreadInterleavingMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(),"Thread 1");
		Thread t2 = new Thread(new MyRunnable(),"Thread 2");
		t1.start();
		t2.start();
	}
}

//The way the response came is called thread interleaving 
/*
Thread 1-Number:0
Thread 1-Number:1
Thread 2-Number:0
Thread 2-Number:1
Thread 2-Number:2
Thread 2-Number:3
Thread 2-Number:4
Thread 1-Number:2
Thread 1-Number:3
Thread 1-Number:4
*/