package com.practice.core.java8;

public class MethodRefernceAfterDemo {
	
	public void m1() {
		for(int i = 0 ; i<10;i++) {
			System.out.println("Child Thread - 1");
		}
	}

	public static void main(String[] args) {
		MethodRefernceAfterDemo md = new MethodRefernceAfterDemo();
         Runnable r = md::m1;
         Thread t = new Thread(r);
         t.start();
         for(int i = 0 ; i<10;i++) {
 			System.out.println("Main Thread - 1");
 		}
	}
}
