package strings;
import java.util.Scanner;
public class Essay {
	private String essay;
	private String name;
	Scanner input=new Scanner(System.in);
public Essay(){
	name="bob";
	essay="invalid";
	
}
public void setName(String newN){
	name=newN;
}
public void setEssay(String newE){
	essay=newE;
}
public String getName(){
	return name;
}
public String getEssay(){
	return essay;
}
public String getLast(){
	String last="o";
	int count=0;
	while(name.charAt(count)!=' '){
		count++;
	}
	last=name.substring(count+1, name.length());
	return last.toUpperCase();
}
public int getNumber(){
	int count=0;
	while(name.charAt(count)!=' '){
		count++;
	}
	return (count);
}
public boolean findX(){
	int blue=name.indexOf('x');
	if(blue!=-1){
		return true;
	}
	else{
		return false;
	}
}
public int wordCount(){
	int count = essay.length() - essay.replace(" ", "").length();
	return (count+1);
}
}
