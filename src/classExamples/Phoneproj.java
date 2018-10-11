package classExamples;

public class Phoneproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone yours=new Phone();
		yours.disPhone();
		System.out.println("Your last call was to " + yours.call(262.4885758, 3.65));
		System.out.println("Your old number was: " + yours.myNumber());
		System.out.println("Your new number is: " +yours.myNumber(402.6809162));
		yours.disPhone();
		System.out.println("Your last call was to " + yours.call(262.4885758, 3.65));
		yours.disPhone();
	}

}
