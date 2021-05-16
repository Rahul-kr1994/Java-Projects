package com.practice.core.exceptionHandling;

public class FinallyImportance4 {
	public static void main(String[] args) {

		try {
			System.out.println("try");
			return;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}