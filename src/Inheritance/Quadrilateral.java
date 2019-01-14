package Inheritance;

public class Quadrilateral {
	private double sideA;
	private double sideB;
	private double sideC;
	private double sideD;
public Quadrilateral(double side1,double side2,double side3, double side4){
	sideA=side1;
	sideB=side2;
	sideC=side3;
	sideD=side4;
}
public Quadrilateral(){
	sideA=1;
	sideB=1;
	sideC=1;
	sideD=1;
}
public double getSide(int num){
	if(num==1){
		return sideA;
	}if(num==2){
		return sideB;
	}if(num==3){
		return sideC;
	}if(num==4){
		return sideD;
	}
	return 0;
}
public void setSide(int num,double set){
	if(num==1){
		sideA=set;
	}if(num==2){
		sideB=set;
	}if(num==3){
		sideC=set;
	}if(num==4){
		sideD=set;
	}
}
public double perimeter(){
	return(sideA+sideB+sideC+sideD);
}
}
