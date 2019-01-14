package Inheritance;

public class Rectangle extends Paralellagram implements Geo{
	public Rectangle(double side,double side2){
		super(side,side2);
	}
	public Rectangle(){
		super(1,1);
	}
	public double area(){
		double blue=super.getSide(1)*super.getSide(2);
		return blue;
	}
}
