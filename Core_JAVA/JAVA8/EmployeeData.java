package com.practice.core.java8;

public class EmployeeData {

	private String firstName;
	private String org;
	private int salary;

	public EmployeeData(String firstName, String org, int salary) {
		super();
		this.firstName = firstName;
		this.org = org;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeData [firstName=" + firstName + ", org=" + org + ", salary=" + salary + "]";
	}

}
