/**
 * 
 */
package com.arai.producerNConsumer;

/**
 * @author Akansh_Rai
 *
 */
public class Number {
	
	private long number;
	
	public Number(long _number) {
			this.number = _number;
	}
	
	public long getNumber() { return number;};
	
	public void incrementNumber() {
		number++;
	}
	
	public void printNumber() {
		System.out.println(number);
	}
}
