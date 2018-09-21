package scannerGrams;

import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=2;
		double we=3;
		double num=9.99;
		Scanner age=new Scanner(System.in);
		System.out.println("How old are you?");
		init= age.nextInt();
		Scanner number=new Scanner(System.in);
		System.out.println("What is your favorite number?");
		num= number.nextDouble();
		Scanner weight=new Scanner(System.in);
		System.out.println("How much do you weigh?");
		we= weight.nextDouble();
		System.out.println("I see that in " +(we/7+36)+ " days, you will adopt " +(init+89) +" goldfish and you will have them for " +(num*3.22)+" years.");
	
	}

}
