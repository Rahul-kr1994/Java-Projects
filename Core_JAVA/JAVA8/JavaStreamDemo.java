package com.practice.core.java8;

import java.util.Arrays;
import java.util.List;

public class JavaStreamDemo {
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	public static void main(String[] args) {
		Integer[] numbers = {1,2,22,22,22,3};
		int n = JavaStreamDemo.sumStream(Arrays.asList(numbers));
		System.out.println(n);
	}
}
