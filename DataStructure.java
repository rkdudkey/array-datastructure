import java.util.ArrayList;

public class DataStructure {
//Write a public static method called "toPower" that takes in as parameters two integers called size and power.
//The method should return an array of size "size" with each array index raised to the value of "power." 
//So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].

	public static void toPower(int size, int power) {
		ArrayList<Integer> base = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			base.add((int) Math.pow(i, power));
		}

		System.out.println(base);
	}

	public static void main(String[] args) {
		toPower(4, 2);
		
	}

}