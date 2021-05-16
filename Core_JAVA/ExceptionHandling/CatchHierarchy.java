package com.practice.core.exceptionHandling;

public class CatchHierarchy {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
	}
}
