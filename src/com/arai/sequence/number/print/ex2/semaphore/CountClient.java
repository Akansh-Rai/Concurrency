/**
 * 
 */
package com.arai.sequence.number.print.ex2.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Akansh_Rai
 *
 */
public class CountClient {

	public static void main(String[] args) {
		Number number = new Number(0);
		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(0);
		Semaphore s3 = new Semaphore(0);

		Thread t1 = new Thread(new Count(number, s1, s2), "t1");
		Thread t2 = new Thread(new Count(number, s2, s3), "t2");
		Thread t3 = new Thread(new Count(number, s3, s1), "t3");

		t1.start();
		t2.start();
		t3.start();
	}
}
