package com.practice.core.exceptionHandling;
public class TestWithException {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		System.out.println(10/0);
	}
}
