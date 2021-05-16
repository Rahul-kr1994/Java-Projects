package com.practice.core.java8;

public class BeforePredicate {

	public boolean test(Integer i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
	  BeforePredicate bp = new BeforePredicate();
	  boolean testResult = bp.test(10);
	  System.out.println(testResult);
	}
}


