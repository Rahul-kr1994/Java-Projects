package com.practice.EverythingAboutString;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String s = new String("Durga");
		String s1 = new String("Durga");
		StringBuffer s2 = new StringBuffer("Durga");
		StringBuffer s3 = new StringBuffer("Durga");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));
	}
}
