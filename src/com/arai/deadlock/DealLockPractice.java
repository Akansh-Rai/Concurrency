package com.arai.deadlock;
public class DealLockPractice {
	public static void main(String[] args) {
		String resoucr1 = "RESOURCE_1";
		String resoucr2 = "RESOURCE_2";
		Runnable runnable1 = ()-> {
			synchronized (resoucr1) {
				System.out.println("thread 1...Accessing resource_1");
				System.out.println("Thread_1 : Going to access resource 2");
				synchronized (resoucr2) {
					System.out.println("thread 1...Accessing resource_2");
				}
			}
		};
		
		Runnable runnable2 = ()-> {
			synchronized (resoucr2) {
				System.out.println("thread 2...Accessing resource_2");
				System.out.println("Thread_2 : Going to access resource 1");
				synchronized (resoucr1) {
					System.out.println("thread 1...Accessing resource_2");
				}
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}
}
