/**
 * 
 */
package com.arai.sequence.number.print.ex2.semaphore;

/**
 * @author Akansh_Rai
 *
 */
public class Number {

	private int number;

	public Number(int _initialNumber) {
		number = _initialNumber;
	}

	public int incrementNumber() {
		return ++this.number;
	}

}
