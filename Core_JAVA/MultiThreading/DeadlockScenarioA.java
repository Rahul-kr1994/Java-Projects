package com.practice.mulitithreading;

public class DeadlockScenarioA {

	public synchronized void d1(DeadlockScenarioB b) {
		System.out.println("Thread 1 starts execution of d1 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 1 tying to call DeadlockScenarioB's last method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside DeadlockScenarioA last method");
	}
}
