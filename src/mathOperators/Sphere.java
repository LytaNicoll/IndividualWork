package mathOperators;
import java.util.Scanner;
import java.lang.Math;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double init=2;
		double thing=3;
		double tingy=0;
		final double AREA=1.3333333333333333;
		final double PI=3.14159;
		Scanner spherei=new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		init= spherei.nextDouble();
		tingy=Math.pow(init,thing);
		System.out.println("The volume is " +((Math.PI)*(AREA)*(tingy))+ " units cubed");

	}
}