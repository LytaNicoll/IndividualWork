package classExamples;
import java.util.Scanner;
public class Car {
	public Car()
	{
		
	}
	public void Miles()
	{
		int miles=4;
		Scanner input=new Scanner(System.in);
		System.out.println("How many miles did you go this drive?");
		miles=input.nextInt();
		System.out.println(miles+8675309);
	}
	public void Drinks()
	{
		System.out.println("I'm Thirsty! Feed me some gas!");
	}
	public void leak()
	{
		System.out.println("I have a leak! My tire is flat!");
	}
}
