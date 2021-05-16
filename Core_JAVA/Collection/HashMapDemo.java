package com.practice.core.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Chir", 700);
		m.put("Bala", 800);
		m.put("Venka", 200);
		m.put("Naga", 700);
		System.out.println(m);
		System.out.println(m.put("Chir",1000));//old value will be replaced by new value & old value will be returned.
		Set s = m.entrySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		s.forEach(eachSet->{
			Map.Entry m1 = (Map.Entry) eachSet;
			if(m1.getKey().equals("Naga")) {
				m1.setValue(10000);
			}
		});
		System.out.println(m);
	}
}
