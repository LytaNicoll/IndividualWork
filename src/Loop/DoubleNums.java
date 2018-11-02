package Loop;

import java.util.Scanner;

public class DoubleNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int count = 0; int blue = 0; int num = 0; while (num != 9999) {
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please input a number(9999 to quit)"); num =
		 * input.nextInt(); if (num!=9999){ blue = num+blue; count++; } if (num
		 * == 9999) { System.out.println(blue/count); } } }
		 */

		int count = 0;
		double blue = 0;
		double num = 0;
		double big=0;
		Scanner input = new Scanner(System.in);

		System.out.println("Please input a number(9999 to quit)");
		num = input.nextInt();
		while (num != 9999) {
			if (num>big){
				big=num;}
			blue = num + blue;
			count++;
			System.out.println("Please input a number(9999 to quit)");
			num = input.nextInt();
		}

		System.out.println(blue / count);
		System.out.println(big);
	}

}
