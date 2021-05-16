package com.practice.mulitithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableJobDemoMain {

	public static void main(String[] args) throws Exception {
		CallableJobDemo[] jobs = {new CallableJobDemo(10),
				new CallableJobDemo(20),
				new CallableJobDemo(30),
				new CallableJobDemo(40),
				new CallableJobDemo(50),
				new CallableJobDemo(60)};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(CallableJobDemo job : jobs) {
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
