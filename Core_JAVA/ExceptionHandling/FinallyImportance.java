package com.practice.core.exceptionHandling;

public class FinallyImportance {
public static void main(String[] args) {

	try {
		System.out.println("try");
	}catch(Exception e) {
		System.out.println("catch");
	}finally {
		System.out.println("finally");
	}
}
}
