package com.practice.core.java.collection;

import java.util.Comparator;

public class EmployeeComparatorDemo implements Comparator {

	private String name;
	private int eid;

	public EmployeeComparatorDemo() {
		super();
	}

	public EmployeeComparatorDemo(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "name=" + name + "- eid=" + eid;
	}

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeComparatorDemo e1 = (EmployeeComparatorDemo) o1;
		EmployeeComparatorDemo e2 = (EmployeeComparatorDemo) o2;

		String s1 = e1.name;
		String s2 = e2.name;

		return s1.compareTo(s2);
	}

}
