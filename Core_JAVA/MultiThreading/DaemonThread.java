package com.practice.mulitithreading;

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
	}
}
