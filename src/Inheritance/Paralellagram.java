package Inheritance;

public class Paralellagram extends Quadrilateral implements Geo{
	public Paralellagram(double side1, double side2){
		super(side1,side2,side1,side2);
	}
	public Paralellagram(){
		super(1,1,1,1);
	}
	public double area(){
		double blue=super.getSide(1)*super.getSide(2);
		return blue;
	}
}
