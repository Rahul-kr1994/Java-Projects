package com.practice.core.java.collection;

import java.util.TreeSet;

public class TreeSetStringDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new TreeSetStringDemoComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}
