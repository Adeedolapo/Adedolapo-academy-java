package com.bptn.course.Week1;
import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); //Initializing scanner object for user input

	        // Input a non-negative integer
	        System.out.print("# in: ");
	        int amt = scan.nextInt();
	        scan.nextLine(); 

	        // Input a singular noun
	        System.out.print("word: ");
	        String word = scan.nextLine();

	        // If the number is not 1, make the noun plural by adding 's'
	        String pluralNoun;
	        if (amt == 1) {
	            pluralNoun = word; // Singular form
	        } else {
	            // Handling of the following rules
	            if (word.endsWith("fe")) {
	                pluralNoun = word.substring(0, word.length() - 2) + "ves"; // Replace "fe" with "ves"
	            } else if (word.endsWith ("y")) {
	                pluralNoun = word.substring(0, word.length() - 1)  + "ies"; // Replace "y" with "ies"
	            } else if (word.endsWith("sh") || word.endsWith("ch")){
	                pluralNoun = word + "es"; // Add "es" to the end
	            } else if (word.endsWith ("us")) {
	                pluralNoun =word.substring(0, word.length() - 2) + "i"; // Replace "us" with "i"
	            } else if (word.endsWith("ay") || (word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy"))) {
	                pluralNoun = word.substring(0, word.length() - 1) + "ies"; // Special case to handle conflict with first "y" rule
	            } else {
	                pluralNoun = word + "s"; // All other case, just add 's'
	            }
	        }

	                System.out.println(amt + " " + pluralNoun);

	        scan.close(); // Close the scanner

	    }
	}
