package scannerGrams;

import java.util.Scanner;

public class bones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init = 200;
		Scanner bones=new Scanner(System.in);
		System.out.println("How many bones have you broken?");
		init= bones.nextInt();
		System.out.println("You have broken "+ init + " bones?!");
		if (init<=4){
			System.out.println("That is very few!");
		}
		if (init>=5){
			System.out.println("You should be more careful!");
		}
		

	}

}
