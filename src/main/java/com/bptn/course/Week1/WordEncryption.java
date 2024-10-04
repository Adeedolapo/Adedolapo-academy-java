package com.bptn.course.Week1;
import java.util.Scanner;
public class WordEncryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Initialize scanner for user input
        System.out.print("String word: ");
        String input = scan.nextLine();
        String encryptedWord = ""; //Initialize a string to store the encrypted word

       // Loop through each character of the input word
       for (char i : input.toCharArray()) {
           // If character is a lowercase letter (a-z)
           if (i >= 'a' && i <= 'z') {
               // If character is 'z', wrap around to 'a', else shift by one
               encryptedWord += (i == 'z') ? 'a' : (char)(i + 1);
           }
           // If character is an uppercase letter (A-Z)
           else if (i >= 'A' && i <= 'Z') {
               // If character is 'Z', wrap around to 'A', else shift by one
               encryptedWord += (i == 'Z') ? 'A' : (char)(i + 1);
           }
           // If character is not a letter, leave it unchanged
           else {
               encryptedWord += i;
           }
       }

       // Display the encrypted word
       System.out.println("Encrypted word: " + encryptedWord);
       
       scan.close();
   }
}
