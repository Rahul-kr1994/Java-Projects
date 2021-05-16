package com.practice.core.exceptionHandling;

public class CustomException {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if (age>60) {
			throw new TooOldException("Age elapsed");
		}else if(age<18) {
			throw new TooYoungException("You age is below 18");
		}else {
			System.out.println("Thanks for registration");
		}
	}
}
