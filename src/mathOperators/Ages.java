package mathOperators;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		int init=2;
		int we=3;
		int num=9;
		Scanner age=new Scanner(System.in);
		System.out.println("How old are you?");
		init= age.nextInt();
		Scanner number=new Scanner(System.in);
		System.out.println("How old is your friend?");
		num= number.nextInt();
		Scanner agea=new Scanner(System.in);
		System.out.println("How old is another friend?");
		we= agea.nextInt();
		System.out.println("All of you are " +(init+we+num)+ " years old");
	}

}
