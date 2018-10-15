package classExamples;
import java.util.Scanner;
public class Area {
	public Area()
	{
		
	}
	public void Wall()
	{
		int length=4;
		int height=3;
		Scanner input=new Scanner(System.in);
		System.out.println("How tall is the wall?");
		length=input.nextInt();
		System.out.println("How long is the wall?");
		height=input.nextInt();
		System.out.println("The wall's area is "+(length*height)+ " feet squared");
	}
	public void Door()
	{
		int length=4;
		int height=3;
		int doorL=2;
		int doorW=1;
		Scanner input=new Scanner(System.in);
		System.out.println("How tall is the wall?");
		length=input.nextInt();
		System.out.println("How long is the wall?");
		height=input.nextInt();
		System.out.println("How tall is the door?");
		doorL=input.nextInt();
		System.out.println("How long is the door?");
		doorW=input.nextInt();
		System.out.println("The wall's area  without a door is " + ((length*height)-(doorL*doorW))+" feet squared");
	}
	public void Room()
	{
		int length=4;
		int height=3;
		Scanner input=new Scanner(System.in);
		System.out.println("How tall is the wall?");
		length=input.nextInt();
		System.out.println("How long is the wall?");
		height=input.nextInt();
		System.out.println("the room is " +(Math.pow(height,2)*length)+ " feet in area");
		
	}
}
