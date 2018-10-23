package Desiscions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Grade=1;
		double GPA=1;
		System.out.println("Grade?");
		Scanner input=new Scanner(System.in);
		Grade=input.nextDouble();
		System.out.println("GPA?");
		GPA=input.nextDouble();
		if (Grade==12&&GPA>=3.5&&GPA<=4.0){
			System.out.println("You can graduate with honors");
		}
		else{
			System.out.println("Too bad, so sad, no honors for you");
			if(GPA>=4.0){
				System.out.println("4.0 is the max, silly!");
			}
		}
		
	}

}
