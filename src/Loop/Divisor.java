package Loop;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int storage = -99999;
		int divisors = 0;
		int num = 0;
		int numstore = 0;
		for (num = 1; num <= 1000; num++) {
			divisors = 0;
			for (int counter = 1; counter <= (1000); counter++) {
				if (num % counter == 0) {
					divisors++;

					if (divisors > storage) {
						storage = divisors;
						if (num > numstore)
							;
						numstore = num;

					}
				}
			}

		}
		System.out.println(numstore);
	}
}