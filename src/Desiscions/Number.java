package Desiscions;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age=1;
		double weight=1;
		double height=1;
		System.out.println("Age?");
		Scanner input=new Scanner(System.in);
		age=input.nextDouble();
		System.out.println("Height?");
		weight=input.nextDouble();
		System.out.println("Weight?");
		height=input.nextDouble();
		if (age>=18){
			System.out.println("You are an adult. Your lucky number is: "+ height*5);
		}
		else{
			System.out.println("You are a kid. Your lucky number is: "+ weight/2);
			}
		}
		
	}
