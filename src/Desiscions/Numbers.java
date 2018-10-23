package Desiscions;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test1=1;
		double test2=1;
		double dif=1;
		System.out.println("Score of test one?");
		Scanner input=new Scanner(System.in);
		test1=input.nextDouble();
		System.out.println("Score of test two?");
		test2=input.nextDouble();
		if (test1>test2){
			System.out.println("Wow!You enetered the tests in the right order!");
			dif=test1-test2;
			System.out.println("The scores are exactly "+ dif+ " points apart!");
		}
		else{
			System.out.println("You dumdum");	
		}
		System.out.println("Have a nice day!");
		
	}

}
