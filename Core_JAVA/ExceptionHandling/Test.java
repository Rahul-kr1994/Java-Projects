package com.practice.core.exceptionHandling;

public class Test {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		System.out.println("Hello");
	}
}
