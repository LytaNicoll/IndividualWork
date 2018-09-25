package mathOperators;
import java.util.Scanner;
import java.lang.Math;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double init=2;
		double thing=3;
		double tingy=0;
		Scanner spherei=new Scanner(System.in);
		System.out.println("What is the length and width of the room?");
		init= spherei.nextDouble();
		thing= spherei.nextDouble();
		tingy=((((thing*8)*2)+((init*8)*2))/150);
		System.out.println("You need " +tingy+ " Gallons of paint");

	}

}
