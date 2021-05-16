package com.practice.core.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class EmplBiFunctionDemo {

	public static void main(String[] args) {
		ArrayList<Empl> l = new ArrayList<Empl>();
		BiFunction<Integer, String, Empl> f = (eno,name)->new Empl(name,eno);
		l.add(f.apply(100, "RK"));
		l.add(f.apply(200, "RH"));
		l.stream().forEach(e->{
			System.out.println("Employee name :"+e.getName());
			System.out.println("Employee number :"+e.getEmpNo());
			System.out.println();
		});
	}
}
