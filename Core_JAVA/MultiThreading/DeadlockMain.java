package com.practice.mulitithreading;

public class DeadlockMain extends Thread{

	DeadlockScenarioA a = new DeadlockScenarioA();
	DeadlockScenarioB b = new DeadlockScenarioB();
	
	public void m1() {
		this.start();
		a.d1(b);//Main Thread
	}
	
	public void run() {
		b.d2(a);//Child Thread
	}
	
	public static void main(String[] args) {
		DeadlockMain t1 = new DeadlockMain();
		t1.m1();
	}
}
