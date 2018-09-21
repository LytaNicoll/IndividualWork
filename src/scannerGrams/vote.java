package scannerGrams;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean init=true;
		Scanner vote=new Scanner(System.in);
		System.out.println("Did you vote yet?");
		init= vote.nextBoolean();
		if (init==true){
		System.out.println("Yay!");}
		if (init==false){
		System.out.println("Go vote!");}
			
		

	}

}
