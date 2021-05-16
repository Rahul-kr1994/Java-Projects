package com.practice.EverythingAboutString;

public class StringObjectCheck {

	public static void main(String[] args) {
		String s1 = new String("You can't change me");//2 objects 
		String s2 = new String("You can't change me ");//1
		System.out.println(s1==s2);//false
		String s3 = "You can't change me";//0
		System.out.println(s1==s3);//false
		String s4 = "You can't change me";
		System.out.println(s3==s4);//true
		String s5 = "You can't "+"change me";//0 - Concatenation will happen in compile time
		System.out.println(s4==s5);//true
		String s6 = "You can't ";//1
		String s7 = s6+"change me";//2 -  here first "change me" will be created in SCP and at runtime s6 will resolved and s7 object will be created in the heap (any object at runtime will be created in heap)
		System.out.println(s4==s7);//false
		final String s8 = "You can't ";
		String s9 = s8+"change me";//0 So , here s8 is final not a variable , so it will be resolved at compile time and will be available in SCP
		System.out.println(s4==s9);//true
	}
}
