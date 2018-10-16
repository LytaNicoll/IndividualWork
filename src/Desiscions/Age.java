package Desiscions;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=1;
		System.out.println("How old are you?");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		if( age<= 16){
			System.out.println("You are too young");
		}
		
	}

}
