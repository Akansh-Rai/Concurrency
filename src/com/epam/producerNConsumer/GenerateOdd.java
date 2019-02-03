/**
 * 
 */
package com.epam.producerNConsumer;

/**
 * @author Akansh_Rai
 *
 */
public class GenerateOdd implements Runnable {

	private Number number;

	public GenerateOdd(Number _number) {
		this.number = _number;
	}

	@Override
	public void run() {

		try {

				long num = number.getNumber();
				while (num <= 100) {
					synchronized (number) {
						if (num % 2 != 0) {
							Thread.sleep(100);
							number.incrementNumber();
							number.printNumber();
							number.notifyAll();
						} else {
							number.wait();
						}
					}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
