package com.practice.core.exceptionHandling;

public class ClassCastException {
	public static void main(String[] args) {
		Object o = new Object();
		String s = (String) o;
	}
}

