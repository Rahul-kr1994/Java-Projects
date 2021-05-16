package com.practice.core.exceptionHandling;

public class IllegalStateExceptionDemo {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		t.start();
	}
}

