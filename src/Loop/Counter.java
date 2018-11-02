package Loop;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How high to count?");
		j = input.nextInt();
		if (j >= 0) {
			for (int counter = 0; counter <= (j-1); counter = counter + 1) {
				System.out.println((counter + 1));
			}
		}
	}
}
