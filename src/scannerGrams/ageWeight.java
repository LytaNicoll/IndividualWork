package scannerGrams;

import java.util.Scanner;

public class ageWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=2;
		int we=3;
		Scanner age=new Scanner(System.in);
		System.out.println("How old are you?");
		init= age.nextInt();
		System.out.println("You are " +init+ " years old.");
		Scanner weight=new Scanner(System.in);
		System.out.println("How much do you weigh?");
		we= weight.nextInt();
		System.out.println("You are " +we+ " pounds.");
		

	}

}
