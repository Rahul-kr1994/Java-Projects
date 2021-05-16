package com.practice.core.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throws2 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
	}
}