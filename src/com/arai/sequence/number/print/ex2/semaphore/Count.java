/**
 * 
 */
package com.arai.sequence.number.print.ex2.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Akansh_Rai
 *
 */
public class Count implements Runnable {

	private Semaphore firstSemaphore;
	private Semaphore secondSemaphore;
	private Number num;

	public Count(Number _num, Semaphore _firstSemaphore, Semaphore _secondSemaphore) {
		this.num = _num;
		this.firstSemaphore = _firstSemaphore;
		this.secondSemaphore = _secondSemaphore;
	}

	@Override
	public void run() {
		try {

			while (true) {
				firstSemaphore.acquire();
				int currentVal = num.incrementNumber();
				if (currentVal > 100)
					break;
				System.out.println(Thread.currentThread().getName() + " : " + currentVal);
				secondSemaphore.release(1);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			firstSemaphore.release();
			secondSemaphore.release();
		}

	}

}
