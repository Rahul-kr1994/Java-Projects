package com.practice.EverythingAboutString;

public class StringPractice5{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		if(sb.equals(s)) {
			System.out.println("Match1");
		}
		else if(sb.toString().equals(s.toString())) {
			System.out.println("Match2");
		}else {
			System.out.println("No match");
		}
	}
}
