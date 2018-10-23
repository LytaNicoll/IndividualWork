package Desiscions;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=1;
		System.out.println("How much money did you get for your fifth birthday?");
		Scanner input=new Scanner(System.in);
		money=input.nextDouble();
		if (Math.abs(money-Math.sqrt(84.9))<0.001){
			System.out.println("Congrats! You won a house!");
		}
		else{
			System.out.println("Oh No! You won a pool of slime!");
			}
		}
		
	}
