package com.practice.core.java.collection;

import java.util.ArrayList;

public class ArrayListIssueDemo extends Thread {

		static ArrayList l = new ArrayList();
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread Updating List");
			l.add("D");
		}

	public static void main(String[] args) {
		l.add("A");
		l.add("B");
		l.add("C");
		ArrayListIssueDemo t = new ArrayListIssueDemo();
		t.start();
		l.forEach(data->{
			String s = (String) data;
			System.out.println("Main thread iterating list and current object is "+s);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println(l);
	}
}
