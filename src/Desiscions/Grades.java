package Desiscions;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1=1;
		int test2=1;
		System.out.println("Score of test one?");
		Scanner input=new Scanner(System.in);
		test1=input.nextInt();
		System.out.println("Score of test two?");
		test2=input.nextInt();
		if (test1>test2){
			System.out.println("Wow!You enetered the tests in the right order!");
		}
		else{
			System.out.println("You dumdum");	
		}
		System.out.println("DundunDun");
		
	}

}
