package com.practice.core.exceptionHandling;

public class StackOverFlowError {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();

	}

	private static void m2() {
		m1();

	}

}
