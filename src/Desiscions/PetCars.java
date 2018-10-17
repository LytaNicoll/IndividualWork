package Desiscions;
import java.util.Scanner;
public class PetCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pet=1;
		int cars=1;
		System.out.println("How many pets do you have?");
		Scanner input=new Scanner(System.in);
		pet=input.nextInt();
		System.out.println("How many cars do you have?");
		cars=input.nextInt();
		System.out.println(5>=pet||cars>=3);

	}

}
