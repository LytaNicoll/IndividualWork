package classExamples;
import java.math.*;
public class rectangles {
public rectangles(){
	
}
public void sayNumber(double five){
	System.out.println("I recieved: "+five);
}
public void sayNumbertwo(double five){
	System.out.println("I recieved: "+five);
	five=five+2;
	System.out.println("I give you the new number: " +five);
}
public void sayArea(double five,double four){
	System.out.println("I recieved: "+five +" and " +four);
	System.out.println("Your area is: " +(five*four));
}
public void sayRound(double five){
	System.out.println("I recieved: "+five );
	int four= (int)Math.ceil(five);
	System.out.println("You get: " +(four));
}
}
