package com.practice.mulitithreading;

public class DeadlockScenarioB {

	public synchronized void d2(DeadlockScenarioA a) {
		System.out.println("Thread 2 starts execution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 tying to call DeadlockScenarioA's last method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside DeadlockScenarioB last method");
	}
}
