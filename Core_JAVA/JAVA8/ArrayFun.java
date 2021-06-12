package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayFun {

	public static void main(String[] args) {
		List<Integer> f = new ArrayList<>();
		f.add(8);
		f.add(2);
		f.add(4);
		f.add(6);
		f.add(10);

		int value = segment(3, f);
		System.out.println(value);

	}

	public static int segment(int x, List<Integer> space) {
		List<Integer[]> list = new ArrayList<>();
		List<Integer> finallist = new ArrayList<>();
		IntStream.range(0, space.size()).forEach(i -> {
			if (space.size() - i >= x) {
				Integer[] arr = Arrays.copyOfRange(space.stream().toArray(Integer[]::new), i, i + x);
				list.add(arr);
			}
		});
		list.stream().forEach(e -> {
			List<Integer> ints = Arrays.asList(e);
			finallist.add(Collections.min(ints));
		});
		return finallist.stream().mapToInt(i -> i).max().getAsInt();

	}
}
