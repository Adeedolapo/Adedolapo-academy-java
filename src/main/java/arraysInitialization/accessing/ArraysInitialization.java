package arraysInitialization.accessing;

import java.util.concurrent.atomic.AtomicBoolean;

public class ArraysInitialization {

	public static void main(String[] args) {
		
		int [] numbers = { 20,40,60,80,100 };
		
		for (int i = 4; i< numbers.length; i++) {
			System.out.println("Element at index" + i + " : " + numbers[i]);
		}

	}

}
