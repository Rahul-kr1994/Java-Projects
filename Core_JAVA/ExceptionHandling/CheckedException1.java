package com.practice.core.exceptionHandling;

import java.io.PrintWriter;

public class CheckedException1 {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
	}
}
