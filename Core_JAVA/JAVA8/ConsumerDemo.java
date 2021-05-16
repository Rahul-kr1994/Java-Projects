package com.practice.core.java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("RK");
	}
}
