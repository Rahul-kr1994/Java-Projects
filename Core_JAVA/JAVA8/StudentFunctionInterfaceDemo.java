package com.practice.core.java8;

import java.util.Arrays;
import java.util.function.Function;

public class StudentFunctionInterfaceDemo {

	public static void main(String[] args) {
		Function<Student, String> f = s->{
			int marks = s.getMarks();
			String grade="";
			if(marks>=80) {
				grade=  "A";
			}
			else if(marks>=60) {
				grade=  "B";
			}
			else if(marks>=50) {
				grade=  "C ";
			}
			else if(marks>=35) {
				grade=  "D";
			}
			else {
				grade=  "E";
			}
			return grade;
		};
		
		Student[] s = {
				new Student("RK", 90),
				new Student("DK", 90),
				new Student("FK", 90),
				new Student("JK", 90),
		};
		Arrays.stream(s).forEach(e->{
			String grade = f.apply(e);
			System.out.println(e.getName()+":"+grade);
		});
	}
}
