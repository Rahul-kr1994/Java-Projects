package com.practice.geekforgeeks;

public class StringMinimization {

	public static void main(String[] args) {
		String s = "aabcccabba";
		final int mid = s.length() / 2;
		String[] parts = { s.substring(0, mid), s.substring(mid) };
		StringBuilder sb1 = new StringBuilder(parts[0]);
		StringBuilder sb2 = new StringBuilder(parts[1]);
		boolean sbCheckFlag = true;
		while (sbCheckFlag) {
			if (sb1.charAt(0)==sb2.charAt(sb2.length() - 1)) {
				int count1 = sb1.length();
				int count2 = sb2.length();
				for (int i = 0; i < sb1.length(); i++) {
					if (sb1.charAt(0) == sb1.charAt(i)) {
                       count1--;
					}
					else {
						break;
					}
				}
				for (int i =0; i <sb2.length(); i++) {
					if (sb2.charAt(sb2.length()-1) == sb2.charAt(sb2.length() - i)) {
                       count2--;
					}else {
						break;
					}
				}
				sb2= sb2.delete(count2,sb2.length());
				sb1 = sb1.delete(0, sb1.length()-count1);
				
			} else {
				sbCheckFlag = false;
			}
		}
		System.out.println(sb2.append(sb1));

	}
}
