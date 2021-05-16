package com.practice.core.java.collection;

public class EmployeeComparableDemo implements Comparable {

	private String name;
	private int eid;

	public EmployeeComparableDemo(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "name=" + name + "- eid=" + eid;
	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		EmployeeComparableDemo e = (EmployeeComparableDemo) o;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return 1;
		} else {
			return 0;
		}
	}

}
