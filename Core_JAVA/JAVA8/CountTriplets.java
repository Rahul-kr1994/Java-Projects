package com.practice.geekforgeeks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountTriplets {

	public static void main(String[] args) {
		//int[] intArray = { 1, 5, 3, 2 };
		int[] intArray = {2, 3, 4};
		int[] sortedArray = Arrays.stream(intArray).sorted().toArray();
		final IntWrapper intWrapper = new IntWrapper();
		IntStream.range(0, sortedArray.length).forEach(e -> {
			if (e < (sortedArray.length) - 2) {
				if (sortedArray[e] + sortedArray[e + 1] == sortedArray[e + 2]) {
					intWrapper.value++;
				}
			}
		});
		System.out.println(intWrapper.value);
	}
	static class IntWrapper {
		public int value;
	}
}
