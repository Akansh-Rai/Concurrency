/**
 * 
 */
package com.arai.producerNConsumer;

/**
 * @author Akansh_Rai
 *
 */
public class NumberGeneratorMain {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Number number = new Number(0);
		Thread even = new Thread(new GenerateEven(number));
		Thread odd = new Thread(new GenerateOdd(number));
		Thread odd1 = new Thread(new GenerateOdd(number));
		Thread odd2 = new Thread(new GenerateOdd(number));
		even.start();
		odd.start();
		odd1.start();
		odd2.start();
		
	}
}
