package com.practice.mulitithreading;

public class SynchronizedIssueMain {

	public static void main(String[] args) {
		SynchronizedIssue is = new SynchronizedIssue();
		SynchronizedIssueThread t1 = new SynchronizedIssueThread(is, "Dhoni");
		SynchronizedIssueThread t2 = new SynchronizedIssueThread(is, "Yuvi");
		t1.start();
		t2.start();
	}
}
