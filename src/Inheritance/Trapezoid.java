package Inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	public Trapezoid(){
		super(1,1,1,1);
	}
	public Trapezoid(double top,double side1,double bottom, double side2){
		super(top,side1,bottom,side2);
	}
	public double area(){
		double height=3;
		double blue= ((super.getSide(1)+super.getSide(3))/2)*height;
		return blue;
	}
}
