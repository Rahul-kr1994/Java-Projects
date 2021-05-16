package com.practice.mulitithreading;

public class InterThreadCommunication {

	int counter = 1;
	static int N;

	public void printOddNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " from Thread-2");
				counter++;
				notify();
			}
		}
	}

	public void printEvenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " from Thread-1");
				counter++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		N = 10;
		InterThreadCommunication itc = new InterThreadCommunication();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				itc.printEvenNumber();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				itc.printOddNumber();
			}
		});
		t1.start();
		t2.start();
	}
}
