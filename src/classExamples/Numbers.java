package classExamples;

public class Numbers {
public Numbers(){
	
}
public void sayNumber(double five){
	System.out.println("I recieved: "+five);
}
public void sayNumbertwo(double five){
	System.out.println("I recieved: "+five);
	five=five+2;
	System.out.println("I give you the new number: " +five);
}
public void saySum(double five,double four){
	System.out.println("I recieved: "+five +" and " +four);
	System.out.println("I give you the new number: " +(five+four));
}
}
