package com.practice.core.exceptionHandling;

public class LossWithoutTryCatch {

	public static void main(String[] args) {
		System.out.println("Statement - 1");
		System.out.println(10/0);
		System.out.println("Statement - 3");
	}
}
