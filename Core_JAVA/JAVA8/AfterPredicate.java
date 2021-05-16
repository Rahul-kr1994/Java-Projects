package com.practice.core.java8;

import java.util.function.Predicate;

public class AfterPredicate {
	public static void main(String[] args) {
	 Predicate<Integer> p1 = i->i%2==0;
	 System.out.println(p1.test(15));
	}
}
