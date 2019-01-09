package Classes;

public class PileOJunk {
private int num;
public PileOJunk(){
	num=(10 + (int) (Math.random() * (100 - 10 + 1)));
}
public static int idNumber(int counter){
	int count=counter;
	int idNum=count;
	return idNum;
	
}
public static double summy(double newNum1,double newNum2){
	double sum=newNum1+newNum2;
	return sum;
}
public void setNum(int newT){
	num=newT;
	  
}
public int getNum(){
	return num;
}
}
