package com.practice.mulitithreading;

public class ExecutorPrintJob implements Runnable {
	String name;

	public ExecutorPrintJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "..Job started by Thread :" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "..Job completed by Thread :" + Thread.currentThread().getName());
	}

}
