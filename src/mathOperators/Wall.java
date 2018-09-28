package mathOperators;
import java.util.Scanner;
public class Wall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=2;
		Scanner wall=new Scanner(System.in);
		System.out.println("How wide is the wall in feet?");
		init= wall.nextInt();
		System.out.println("The wall is " +(init*8)+ " cubic feet");

	}

}
