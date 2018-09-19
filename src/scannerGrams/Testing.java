package scannerGrams;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init = 200;
		Scanner monkey=new Scanner(System.in);
		System.out.println("How big is an adult monkey in inches?");
		init= monkey.nextInt();
		System.out.println("The monkey is "+ init + " inches big");
	}

}
