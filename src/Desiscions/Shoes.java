package Desiscions;
import java.util.Scanner;
public class Shoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shoe=1;
		int height=1;
		System.out.println("How old are you?");
		Scanner input=new Scanner(System.in);
		shoe=input.nextInt();
		System.out.println("How tall are you?");
		height=input.nextInt();
		System.out.println((shoe+height)==26);
	}

}
