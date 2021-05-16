package com.practice.core.exceptionHandling;

public class Nestedtrycatchfinally2 {

	public static void main(String[] args) {
		try {
			System.out.println("Statement - 1");
			System.out.println("Statement - 2");
			System.out.println("Statement - 3");
			try {
				System.out.println("Statement - 4");
				System.out.println(10/0);
				System.out.println("Statement - 6");
			} catch (NullPointerException e) {
				System.out.println(10/0);
			} finally {
				System.out.println("Statement - 8");
			}
			System.out.println("Statement - 9");
		} catch (NullPointerException e) {
			System.out.println("Statement - 10");
		} finally {
			System.out.println("Statement - 11");
		}
		System.out.println("Statement - 12");
	}
}
