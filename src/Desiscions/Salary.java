package Desiscions;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=1;
		double num2=1;
		double num3=1;
		System.out.println("Number one?");
		Scanner input=new Scanner(System.in);
		num=input.nextDouble();
		System.out.println("Number two?");
		num2=input.nextDouble();
		System.out.println("Number three?");
		num3=input.nextDouble();
		if (num>num2){
			if(num>num3){
				System.out.println(num);
			}
		}
		else{
			if(num2>num3){
				System.out.println(num2);
			}
			else{
				if(num==num2&&num2==num3){
					System.out.println("Your numbers are all the same!");
				}
				else{
				System.out.println(num3);
				}
			}
		}
		
	}

}
