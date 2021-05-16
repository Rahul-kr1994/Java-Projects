package com.practice.geekforgeeks;

import java.util.stream.IntStream;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		int n = 10;
		int s = 15;
		computeSubArray(intArray, n, s);

	}

	private static void computeSubArray(int[] intArray, int n, int s) {
		if (intArray.length != 0) {
			IntStream.range(0, intArray.length).forEach(i -> {
				IntStream.range(i, intArray.length).forEach(j -> {
					if (IntStream.range(i, j).map(index -> intArray[index]).sum() == s) {
						System.out.println(i+1 + " " + j);
					}
				});
				
			});
		}
	}
}
