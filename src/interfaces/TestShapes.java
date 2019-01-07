package interfaces;
import java.util.Scanner;
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double length=input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double width=input.nextDouble();
		Rectangle green=new Rectangle(length,width);
		Activity1 blue=new Rectangle(length,width);
		System.out.println("The area is "+ blue.area()+ " untis and the perimeter is "+blue.perimeter()+" units");
		System.out.println("What is the radius of the circle?");
		double radius=input.nextDouble();
		Activity1 blue1=new Circle(radius);
		System.out.println("The area is "+ blue1.area()+ " untis and the perimeter is "+blue1.perimeter()+" units");
		green.getLength();
	}

}
