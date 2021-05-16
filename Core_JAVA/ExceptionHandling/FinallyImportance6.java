package com.practice.core.exceptionHandling;

public class FinallyImportance6 {
	public static void main(String[] args) {

		try {
			System.out.println("try");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}