package Loop;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int count = 0; int blue = 0; int num = 0; while (num != 9999) {
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please input a number(9999 to quit)"); num =
		 * input.nextInt(); if (num!=9999){ blue = num+blue; count++; } if (num
		 * == 9999) { System.out.println(blue/count); } } }
		 */

		double blue = 0;
		double num = 0;
		double big=0;
		double small=999999;
		Scanner input = new Scanner(System.in);

		System.out.println("Please input a number");
		num = input.nextInt();
		do{
			if (num>big){
				big=num;}
			if(num<small){
				small=num;
			}
			blue = big-small;
			System.out.println("Please input a number(9999 to quit)");
			num = input.nextInt();
		}while (num != 9999) ;
		
			System.out.println("Range is: " +blue);
			System.out.println("The biggest number was: " +big);
			System.out.println("The smallest number was: " +small);
		}

		
	}


