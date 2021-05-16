package com.practice.core.exceptionHandling;

public class ControlFlowtrycatchfinally {

	public static void main(String[] args) {
		try {
			System.out.println("Statement - 1");
			System.out.println("Statement - 2");
			System.out.println("Statement - 3");
		}catch (ArithmeticException e) {
			System.out.println("Statement - 4");
		}finally {
			System.out.println(10/0);
		}
		System.out.println("Statement - 6");
	}
}
