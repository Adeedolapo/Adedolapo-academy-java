package arraysum.elements;

public class ArraySum {

	public static void main(String[] args) {
		
		
		int [] numbers = { 20,40,60,80,100 };
		
		int sum = 0;
		
		for  (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println(sum);

	}

}
