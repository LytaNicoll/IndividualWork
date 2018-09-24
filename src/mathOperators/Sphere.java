package mathOperators;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double init=2;
		final double AREA=1.3333333333333333;
		final double PI=3.14159;
		Scanner spherei=new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		init= spherei.nextDouble();
		System.out.println("The volume is " +((init*init*init)*AREA*PI)+ " units cubed");

	}

}
