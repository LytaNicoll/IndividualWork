package classExamples;
import java.util.Scanner;
public class Car {
	private double gas;
	private double miles;
	public Car()
	{
	gas=-999.999;
}
public double getGas(){
	return gas;
}
public double setGas(double newW){
	System.out.println("I'm full " +newW);
	return gas=newW;
}
public double getMiles(){
	return miles;
}
public double setMiles(double newM){
	System.out.println("You've gone " +newM+ " miles");
	return gas=newM;
}
}
