package com.practice.mulitithreading;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		/*
		 * ThreadGroup g1 = new ThreadGroup("firstGroup");
		 * System.out.println(g1.getParent().getName()); ThreadGroup g2 = new
		 * ThreadGroup(g1,"secondGroup"); System.out.println(g2.getParent().getName());
		 */
		ThreadGroup g1 = new ThreadGroup("tg");//Default priority 10
		Thread t1 = new Thread(g1,"FirstThread");//Default priority 5
		t1.setPriority(2);
		Thread t2 = new Thread(g1,"SecondThread");//Default priority 5
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1,"ThirdThread");
		t3.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
