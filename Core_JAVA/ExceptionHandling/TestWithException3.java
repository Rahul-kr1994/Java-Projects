package com.practice.core.exceptionHandling;

public class TestWithException3 {

	public static void main(String[] args) {
		doStuff();
		System.out.println(10/0);
	}

	private static void doStuff() {
		doMoreStuff();
		System.out.println("Hi");
	}

	private static void doMoreStuff() {
		System.out.println("Hello");
	}
}