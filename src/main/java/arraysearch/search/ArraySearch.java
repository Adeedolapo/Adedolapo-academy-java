package arraysearch.search;

import javax.print.attribute.standard.NumberUpSupported;

public class ArraySearch {

	public static void main(String[] args) {
		String [] people = { "Carlos", "Adewale","Adedolapo","Emad"};
		String targetPerson = "emmanuel";
		boolean found = false;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].equalsIgnoreCase(targetPerson)) {
				found = true;
				System.out.println(targetPerson + " is found at index " + i);
				
			}
		}
		if (!found) {
			System.out.println(targetPerson + " is not in array");
			
		}

	}

}
