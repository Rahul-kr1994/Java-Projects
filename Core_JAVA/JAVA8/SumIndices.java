package com.practice.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumIndices {

	public static void main(String[] args) {
		int[] a = {3,3};
		twoSum(a, 6);
	}
	
public static int[] twoSum(int[] nums, int target) {
	List<Integer> resultList = new ArrayList<Integer>();
	
        IntStream.range(0, nums.length).forEach(i->{
        	IntStream.range(i, nums.length).forEach(e->{
        		if(nums[i]+nums[e]==target && i!=e) {
        			System.out.println(i);
        			System.out.println(e);
        			System.out.println(nums[i]);
        			System.out.println(nums[e]);
        			resultList.add(i);
        			resultList.add(e);		
        		}
        	});
        });
        System.out.println(resultList);
        return resultList.stream().mapToInt(i->i).toArray();
    }

}
