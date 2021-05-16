package com.practice.core.java.collection;

import java.util.HashMap;

public class HashMapStrongDemo {

	static class Temp {
		public String toString() {
			return "temp";
		}

		public void finalize() {
			System.out.println("final");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "dg");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
