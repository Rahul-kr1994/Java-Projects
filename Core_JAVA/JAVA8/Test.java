package com.practice.core.java8;

public class Test implements Left , Right {

	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
	
}
