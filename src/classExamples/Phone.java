package classExamples;

public class Phone {

		private double phnumber;
		private double spdial;
		private double ltnumber;
		private int emergnumber;
		private double calls;
		private double minutes;
		public Phone()
		{
		phnumber=999.9990001;
		spdial=444.4444444;
		ltnumber=414.5559091;
		emergnumber=911;
		calls=397;
		minutes=55.3;
	}
	public double myNumber(){
			return phnumber;
		}
	public double speedDial(double newnum){
		return spdial=newnum;
	}
	public double myNumber(double newnum){
		return phnumber=newnum;
	}
	public double call(double newW, double newT){
		calls=calls+1;
		minutes=minutes+newT;
		return ltnumber=newW;
	}
	public void disPhone(){
		System.out.println(phnumber);
		System.out.println(spdial);
		System.out.println(ltnumber);
		System.out.println(emergnumber);
		System.out.println("You have made "+ calls+ " calls");
		System.out.println("You have spent "+minutes+ " minutes of your monthly plan");
	}
}
