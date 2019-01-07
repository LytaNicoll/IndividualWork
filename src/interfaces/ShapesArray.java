package interfaces;

import java.util.ArrayList;

import arrays.Friend;

public class ShapesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1;
		int max=24;
		double total=10000000;
		ArrayList<Activity1> bob = new ArrayList<Activity1>();
		for(int i=0;i<20;i++){
			Rectangle joe=new Rectangle(min + ((int) (Math.random() * (max - min + 1))),min + ((int) (Math.random() * (max - min + 1))));
			bob.add(joe);
		}
		for(int i=0;i<20;i++){
			Circle joe=new Circle(min + ((int) (Math.random() * (max - min + 1))));
			bob.add(joe);
		}
		for(int i=0;i<bob.size();i++){
			if(bob.get(i).perimeter()<total){
			total=bob.get(i).perimeter();
			}
			
		}
		System.out.println("The smallest perimeter is: "+total+" units");
	}

}
