package com.practice.core.exceptionHandling;

public class Nestedtrycatchfinally {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				System.out.println(10 / 0);
			} catch (NullPointerException e) {
				System.out.println("Inner catch block");
			}
			System.out.println("Outside of inner try-catch block");
		} catch (Exception e) {
			System.out.println("Outer catch block");
		}finally {
			System.out.println("Outer finally block");
		}
	}
}
