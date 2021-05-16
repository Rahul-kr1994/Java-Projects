package com.practice.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaximumDifference {

	public static void main(String[] args) {
		int[] intArray =  {80, 2, 6, 3, 100};
		int max = Arrays.stream(intArray).max().getAsInt();
		int maxIndex = IntStream.range(0, intArray.length).filter(i->intArray[i] == max).findFirst().getAsInt();
		List<Integer> al = new ArrayList<Integer>();
		IntStream.range(0, maxIndex).forEach(e->{
			al.add(intArray[e]);
		});
        int min = al.stream().mapToInt(i->i).min().getAsInt();
        System.out.println(max-min);
		
		
		
		/*
		 * int min = Arrays.stream(intArray).sorted().min().getAsInt();
		 * System.out.println(min);
		 */
		/*
		 * int indexOfMax = 0; for(int i = 0 ; i<intArray.length;i++) {
		 * if(intArray[i]==max) { indexOfMax=i; } }
		 */
		
	}
}
