package com.practice.core.java8;

public class Empl {

	private String name;
	private int empNo;

	public Empl(String name, int empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "Empl [name=" + name + ", empNo=" + empNo + "]";
	}

}
