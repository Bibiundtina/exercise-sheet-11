package Fibonacci;
/**
 * 
 * @author mrpeanutbutter
 *
 */

public class Fibonacci {

	/**
	 * 	/*
	 * this static method calculates the fibonacci number in a recursive.
	 * 
	 *
	 * @param ordnung of the fib number
	 * @return the fib number of given number
	 * 
	 * PreCondition: order >= 0; order <= 46
	 */
	int calcFibonacci(int ordnung) {
		
		assert (ordnung >= 0);
		
		if (ordnung <= 0) {
			return 0;
		}
		else if (ordnung <= 1) {
			return 1;
		}			
		else {		
			return calcFibonacci(ordnung-2)+calcFibonacci((ordnung-1));
		}
	}
	public static void main (String[] args) {
		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.calcFibonacci(-7));
	}
}
