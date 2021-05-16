package com.practice.mulitithreading;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedIssue {
	
	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.tryLock();
		for(int i = 0 ; i<10;i++) {
			System.out.print ("GM");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
		l.unlock();
	}
}
