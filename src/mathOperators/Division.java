package mathOperators;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=2;
		int div=3;
		int answer=0;
		int extra=0;
		Scanner dividend=new Scanner(System.in);
		System.out.println("What number do you wish to divide??");
		init= dividend.nextInt();
		Scanner divisor=new Scanner(System.in);
		System.out.println("What number are you dividing by?");
		div= divisor.nextInt();
		System.out.println(init+" divided by "+div +" is equal to:");
		answer= init/div ;
		extra=init%div;
		System.out.println(answer +"r"+extra);
	}

}
