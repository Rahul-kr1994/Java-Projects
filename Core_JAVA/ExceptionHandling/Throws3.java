package com.practice.core.exceptionHandling;

public class Throws3 {

	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff(){
		Thread.sleep(1000);

	}
}
