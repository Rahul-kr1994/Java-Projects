package com.practice.EverythingAboutString;

public class FinalvsImmulatbleDemo {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("dd");
		sb.append("ee");
		System.out.println(sb);
		//sb = new StringBuffer("ff");
	}
}
