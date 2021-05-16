package com.practice.mulitithreading;

public class SynchronizedIssueThread extends Thread {

	SynchronizedIssue is;
	String name;

	public SynchronizedIssueThread(SynchronizedIssue is, String name) {
		this.is = is;
		this.name = name;
	}
	
	@Override
	public void run() {
		is.wish(name);
	}
	
}
