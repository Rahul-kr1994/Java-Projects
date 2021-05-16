package com.practice.core.java.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapBenefitDemo extends Thread {

	//static HashMap m = new HashMap();
	static ConcurrentHashMap m = new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child thread updating Map");
		m.put(103, "C");
	}
	
	public static void main(String[] args) {
		m.put(101, "A");
		m.put(102, "B");
		ConcurrentHashMapBenefitDemo t = new ConcurrentHashMapBenefitDemo();
		t.start();
		m.keySet().forEach(eachKey->{
			Integer i = (Integer) eachKey;
			System.out.println("Main thread iterating and current entry is : "+i+"..."+m.get(i));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println(m);
	}
}
