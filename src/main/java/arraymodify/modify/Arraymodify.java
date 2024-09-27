package arraymodify.modify;

import java.lang.module.ModuleDescriptor.Exports.Modifier;

public class Arraymodify {

	public static void main(String[] args) {
		int [] numbers = { 20,40,60,80,100 };
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i]> 40) {
				numbers [i] += 20;
			}
		}
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + " : " + numbers[i]);
		}

	}

}
