package Desiscions;
import java.util.Scanner;
public class Shoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shoe=1;
		int height=1;
		System.out.println("What is your shoe size??");
		Scanner input=new Scanner(System.in);
		shoe=input.nextInt();
		System.out.println("How tall are you?");
		height=input.nextInt();
		System.out.println((shoe+height)>=26);
		if (9<=shoe&&height<=62){
			System.out.println("Not today, Bud");
		}
	}

}
