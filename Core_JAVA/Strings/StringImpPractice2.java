package com.practice.EverythingAboutString;

public class StringImpPractice2 {

	public static String mask(String cc) {
		String x = "XXXX-XXXX-XXXX-";
		return x+cc.substring(15, 19);
	}
	public static void main(String[] args) {
		System.out.println(mask("1234-5678-9101-5979"));
	}
}
