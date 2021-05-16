package com.practice.core.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalNullableTest {
	
	private static Map<String, Employee> empMap = new HashMap<String, Employee>();
	
	private static Map<String, Employee> initMap(){
		empMap.put("TCS", new Employee(101, "RK", "Rk@gmail.com"));
		empMap.put("TCl", new Employee(103, "Rt", "Rf@gmail.com"));
		empMap.put("TCd", new Employee(104, "Rh", "Rd@gmail.com"));
		empMap.put("TCf", new Employee(105, "Rg", "Rs@gmail.com"));
		empMap.put("TCg", new Employee(106, "Rf", "Rw@gmail.com"));
		return empMap;
	}

	public static void main(String[] args) {
		empMap=initMap();
		String[] strArray = {"TCS","CGI","TCl","TCd","Dell","TCf","TCg","Crif"};
		Arrays.stream(strArray).forEach(str->{
			Optional.ofNullable(empMap.get(str)).ifPresent(System.out::println);
		});
	}
}
