package com.practice.core.java.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateCheckDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("A");
		l.add("E");
		System.out.println(l);
		HashSet ss = new HashSet();
		ArrayList ll = new ArrayList();
		l.forEach(eachData->{
			if(ss.contains(eachData)) {
				ll.add(eachData);
			}
			else {
				ss.add(eachData);
			}
		});
		System.out.println(ll);
	}
}
