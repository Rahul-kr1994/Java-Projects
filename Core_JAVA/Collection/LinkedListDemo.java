package com.practice.core.java.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("RK");//RK
		l.add(null);//RK , null
		l.add("RK");//RK,null,RK
		l.set(0, "KK");//KK,null,RK
		l.add(0, "PK");//PK,KK,null,RK
		l.removeLast();//PK,KK,null
		l.addFirst("OK");//OK,PK,KK,null
		System.out.println(l);
	}
}
