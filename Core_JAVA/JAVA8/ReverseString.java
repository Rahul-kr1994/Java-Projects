package com.practice.geekforgeeks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		StringBuilder sb = new StringBuilder();
		List<String> listOfString = Stream.of(s.split("\\."))
										  .map(eachString->new String(eachString))
										  .collect(Collectors.toList());
		IntStream.range(0,listOfString.size()).map(i-> (listOfString.size()-i) + (0-1)).forEach(e->{
			if(e!=0) {
			sb.append(listOfString.get(e)+".");
			}else {
			sb.append(listOfString.get(e));
			}
		});
		
		System.out.println(sb.toString());
	}
}
