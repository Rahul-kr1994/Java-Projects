package com.practice.mulitithreading;

public class EvenOddDiffThread {

	int counter=1;
	static int N;
	
	private void printOdd() {
		synchronized (this) {
			while(counter<N) {
				while(counter%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread 1 : "+counter);
				counter++;
				notify();
			}
		}
	}
	
	private void printEven() {
		synchronized (this) {
			while(counter<N) {
				while(counter%2==1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread 2 : "+counter);
				counter++;
				notify();
			}
		}
	}
	public static void main(String[] args) {
		N = 10;
		EvenOddDiffThread eo = new EvenOddDiffThread();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				eo.printOdd();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				eo.printEven();
			}
		});
		t1.start();
		t2.start();
	}
}

