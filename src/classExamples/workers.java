package classExamples;

public class workers {
	private double wage;
	private double level;
public workers(){
	wage=-999.999;
	level=2;
}
public double getWage(){
	return wage;
}
public double setWage(double newW){
	System.out.println("Your old wage was: " +newW);
	return wage=newW*1.10;
}
public double getLevel(){
	return level;
}
public double setLevel(double neW){
	System.out.println("Your level is: "+neW);
	return level=neW;
}
}
