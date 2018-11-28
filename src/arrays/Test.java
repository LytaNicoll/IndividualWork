package arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rex = new Rectangle[100];
		int smallest = rex[0].area();
		int index = 0;
		for (int i = 0; i < 100; i++) {
			Rectangle bob = new Rectangle(10 + ((int) (Math.random() * (56 - 10 + 1))),
					10 + ((int) (Math.random() * (56 - 10 + 1))));
			rex[i] = bob;
		}
		for (int h = 0; h < 100; h++) {
			if (rex[h].area() < smallest) {
				smallest = rex[h].area();
				index = h;
				rex[1] = rex[h];
			}
		}
		for (int j = 0; j < 100; j++) {
			System.out.print("Length: " + rex[j].getLength());
			System.out.print(" Width: " + rex[j].getWidth());
			System.out.print(" Area: " + rex[j].area());
			System.out.println();
		}
	}

}
