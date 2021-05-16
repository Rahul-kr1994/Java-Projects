package com.practice.mulitithreading;

public class DaemonThreadDemoChild extends Thread{

	public void run() {
		for(int i = 0 ; i<10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
