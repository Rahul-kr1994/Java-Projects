package com.practice.mulitithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPrintJobDemo {

	public static void main(String[] args) {
		ExecutorPrintJob[] jobs = {new ExecutorPrintJob("Rahulwa"),
				new ExecutorPrintJob("Chamania"),
				new ExecutorPrintJob("Raganiya"),
				new ExecutorPrintJob("Fagania"),
				new ExecutorPrintJob("Tagania"),
				new ExecutorPrintJob("Sagania")};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(ExecutorPrintJob job:jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}
