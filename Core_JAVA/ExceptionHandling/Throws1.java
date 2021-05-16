package com.practice.core.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throws1 {

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.println("Hello");
	}
}
