package com.practice.mulitithreading;

public class DaemonThreadDemoMain {

	public static void main(String[] args) {
		DaemonThreadDemoChild t = new DaemonThreadDemoChild();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main Thread");
	}
}
