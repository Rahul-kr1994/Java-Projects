package com.practice.EverythingAboutString;

public class StringImpPractice1 {

	static class MyString {
		String msg;

		public MyString(String msg) {
			this.msg = msg;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("JAVA SE 8"));
		System.out.println("Hello " + new MyString("JAVA SE 8"));
	}
}
