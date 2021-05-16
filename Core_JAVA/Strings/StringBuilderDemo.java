package com.practice.EverythingAboutString;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Durga");
		String str1 = sb1.toString();
		String str2=sb1.toString();
		System.out.println(str1==str2);
	}
	
}
