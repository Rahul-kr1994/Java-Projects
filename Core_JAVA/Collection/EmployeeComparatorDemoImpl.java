package com.practice.core.java.collection;

import java.util.TreeSet;

public class EmployeeComparatorDemoImpl {

	public static void main(String[] args) {
		EmployeeComparatorDemo e1 = new EmployeeComparatorDemo("Nag",100);
		EmployeeComparatorDemo e2 = new EmployeeComparatorDemo("Bal",200);
		EmployeeComparatorDemo e3 = new EmployeeComparatorDemo("Chiru",50);
		EmployeeComparatorDemo e4 = new EmployeeComparatorDemo("Venki",150);
		EmployeeComparatorDemo e5 = new EmployeeComparatorDemo("Nag",100);
		
		TreeSet t = new TreeSet(new EmployeeComparatorDemo());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}
