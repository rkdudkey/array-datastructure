
public class sumAll {
	
	public static void sumAllVal(int[] val) {
		
		int sum = 0;
		for(int i=0; i< val.length; i++) {
			sum += val[i];
		}
		
		System.out.println("Sum of this array is: " + sum);
	}
	
	public static void main(String[] args ) {
		int []numbers = {2,4,5,8,7,6,3,9}; 
		
		sumAllVal(numbers);
	}
}
