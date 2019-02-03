/**
 * 
 */
package com.arai.deadlock;

/**
 * @author Akansh_Rai
 *
 */
public class DeadLockExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String resourceA = "resourceA";
		String resourceB = "resourceB";
		
		Runnable runnable1 = () -> {
			synchronized (resourceA) {
				
				try {
					System.out.println("Thread A");
					Thread.currentThread().sleep(100);
					synchronized (resourceB) {
						System.out.println("thread A accessing resource b");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable runnable2 =() -> {
			synchronized (resourceB) {
				try {
					System.out.println("Thread B");
					Thread.currentThread().sleep(100);
					synchronized (resourceB) {
						System.out.println("thread B accessing resource A");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread a = new Thread(runnable1);
		Thread b = new Thread(runnable2);
		a.start();
		b.start();
		System.out.println("No deadlock.. All fine");
	}

}
