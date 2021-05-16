package com.practice.core.java8;

public interface DefaultMethodInterface {

	default void m1() {
		System.out.println("Default impl");
	}
}
