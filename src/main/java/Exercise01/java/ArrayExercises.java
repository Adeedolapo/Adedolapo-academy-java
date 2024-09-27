package Exercise01.java;

public class ArrayExercises {

	public static void main(String[] args) {
		int [] nums = {1, 4, 6, 7, 8, 9, 3, 13, 26};
		
		int sum = 0;
		for (int num : nums) {
			sum = sum + num;
		}
		double avg = (double) sum / nums.length;
		System.out.println("The avg is: " + avg);
	}

}

		












