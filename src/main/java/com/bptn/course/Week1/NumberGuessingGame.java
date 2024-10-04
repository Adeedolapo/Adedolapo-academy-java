package com.bptn.course.Week1;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Initializing scanner object for user input
        
        int targetNumber = 23; //Initializing the target number
        int guess = 0; //Initializing variable to store users guess
        // Loop to keep asking for guesses until the user guesses correctly
        while (guess != targetNumber) {
            System.out.print("Please enter a number between 1 and 100: ");
            guess = scan.nextInt(); // Read the user's guess

        if (guess < 1 || guess > 100){
            System.out.println("Please enter a number between 1 and 100! Try again");
            }   
        else if (guess < targetNumber){
            System.out.println("Too low! Try again.") ;    
        }
        else if (guess > targetNumber){
            System.out.println ("Too high! Try again.");
        }

        else { System.out.println ("Congratulations! You guessed the number correctly!") ;
        }
        }

    scan.close();

    }
}