/**
 * 
 */
package com.arai.sequence.number.print.ex1;

/**
 * @author Akansh_Rai
 *
 */
public class Number implements Runnable {

	private int remainder;
	private static int number = 1;
	static Object lock = new Object();

	public Number(int _remainder) {
		this.remainder = _remainder;
	}

	@Override
	public void run() {

		while (number < 100) {
			try {
				synchronized (lock) {
					while (number % 3 != remainder) {
						lock.wait();
					}
					//Thread.currentThread().sleep(1000);
					System.out.println(Thread.currentThread().getName() + " : " + number++);
					lock.notifyAll();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
