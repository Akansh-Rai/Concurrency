/**
 * 
 */
package com.arai.sequence.number.print.ex1;

/**
 * @author Akansh_Rai
 * https://java2blog.com/print-sequence-3-threads-java/
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Number numberRun1 = new Number(1);
		Number numberRun2 = new Number(2);
		Number numberRun3 = new Number(0);
		new Thread(numberRun1, "T1").start();
		new Thread(numberRun2, "T2").start();
		new Thread(numberRun3, "T3").start();
	}

}
