package com.practice.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployeeCheck {

	public static void main(String[] args) {
		List<EmployeeData> empData = new ArrayList<EmployeeData>();
		empData.add(new EmployeeData("RK", "Google", 123456));
		empData.add(new EmployeeData("SK", "Googlfe", 12345));
		empData.add(new EmployeeData("GK", "Googse", 1234));
		empData.add(new EmployeeData("NK", "Googwe", 123));
		empData.add(new EmployeeData("UK", "Googde", 123451));
		Predicate<EmployeeData> empCheck = e->e.getSalary()>123;
		empData.stream().forEach(e->{
			System.out.println(empCheck.test(e));
		});
	}


}
