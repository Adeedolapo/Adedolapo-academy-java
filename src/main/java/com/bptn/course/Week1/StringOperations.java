package com.bptn.course.Week1;
import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// Initializing scanner for user input
        int option; //Declaring variable for user to input
        String message1, message2;// Initializing string to store user input

        // do-while loop to keep prompting the user until they want to exit
        do {
            System.out.println("\n...String Menu...");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.print("Input option: ");
            option = scan.nextInt();
            scan.nextLine();

            // Palindrome Check
            if (option == 1) {
                System.out.println("Enter a string : " );
                message1 = scan.nextLine();
                String reverseInput = "";

                for (int i = message1.length() - 1; i >= 0; i--){
                    reverseInput += message1.charAt(i);
                }
                if(message1.toLowerCase().equals(reverseInput.toLowerCase())) {
                    System.out.println(message1 + " is a palindrome");
                }else {
                    System.out.println(message1 + " is not a palindrome");
                }
                
        }
            else if (option == 2) {
                // Reverse Check
                System.out.println("Enter a string to reverse : ");
                message1 = scan.nextLine();
                String reverse = "";

                for (int i = message1.length() - 1; i >= 0; i--) {
                    reverse += message1.charAt (i);
                }
                System.out.println(reverse);
            }
            else if (option == 3) {
                //Concatenation
                System.out.println ("Enter First string");
                message1 = scan.nextLine();
                System.out.println ("Enter Second string");
                message2 = scan.nextLine();
                System.out.println (message1 + message2);
            }
            else if (option == 4) {
                //Equal Check
                System.out.println ("Enter First string");
                message1 = scan.nextLine();
                System.out.println ("Enter Second string");
                message2 = scan.nextLine();
                if (message1.equals(message2)) {
                    System.out.println("The entered strings are equal");
                }
                else {
                    System.out.println("The entered strings are not equal");
                }

            }
            else if (option == 5) {
                // Length check
                System.out.println("Enter string to calculate the length of string");
                message1 = scan.nextLine();
                System.out.println("The length of the entered string is: " + message1.length());
            }
            else {
                // Invalid choice check
                System.out.println("Invalid choice! Please make a valid choice.");
            }
        }   while (option >= 1 && option <= 5); // Keep looping until the user enters any other option to exit.

            scan.close();

    }
}

