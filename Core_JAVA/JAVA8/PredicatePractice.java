package com.practice.core.java8;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePractice {
	
	public static void main(String[] args) {
		String[] sArray = {"Rahul","Rahulwa","Fahulwa","Kaj"};
		Predicate<String> p  = s->s.length()>5;
		Arrays.stream(sArray).filter(p).forEach(e->{
			System.out.println(e);
		});
	}
}
