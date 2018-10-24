package Loop;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double blue = 0;
		double num = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Please input a number");
		num = input.nextInt();
		do {
			System.out.println("Magic number is: " +(num*17));
			System.out.println("Please input a number(9999 to quit)");
			num = input.nextInt();
		} while (num != 9999);
		
	}
}
