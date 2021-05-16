package com.practice.core.exceptionHandling;

import java.io.FileReader;

public class TryWithResource {
public static void main(String[] args) throws Exception {
	try(FileReader fr = new FileReader("input.txt")){
		
	}
}
}
