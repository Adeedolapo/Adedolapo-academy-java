package com.bptn.course.Week1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Initializing scanner for user input
        int number;// Initializing variable for user to select input
        double num1, num2, result;// Initializing variable to store user input

        // do-while loop to keep prompting the user until they want to exit
        do {
            System.out.println("\nCalculator Menu");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.println("To continue calculation Press 1, else press any other number to exit");
            System.out.print("Input number: ");
            number = scan.nextInt();

            // Perform calculations using if-else statements
            if (number == 1) {
                // Addition
                System.out.print("Input first number: ");
                num1 = scan.nextDouble();
                System.out.print("Input second number: ");
                num2 = scan.nextDouble();
                result = num1 + num2;
                System.out.println("The sum of the numbers " + num1 + "and" + num2 + "is = " + result);
            } 
            else if (number == 2) {
                // Subtraction
                System.out.print("Input first number: ");
                num1 = scan.nextDouble();
                System.out.print("Input second number: ");
                num2 = scan.nextDouble();
                result = num1 - num2;
                System.out.println("Subtracting " + num2 + " from " + num1 + " is = " + result);
            } 
            else if (number == 3) {
                // Multiplication
                System.out.print("Input first number: ");
                num1 = scan.nextDouble();
                System.out.print("Input second number: ");
                num2 = scan.nextDouble();
                result = num1 * num2;
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
            } 
            else if (number == 4) {
                // Division
                System.out.print("Input first number: ");
                num1 = scan.nextDouble();
                System.out.print("Input second number: ");
                num2 = scan.nextDouble();
                result = num1 / num2;
                double remainder = num1 % num2;
                System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + result);
                System.out.println("The remainder is " + remainder);
                
            } 
            else if (number == 5) {
                // Squaring a number
                System.out.print("Enter the number to find Square: ");
                num1 = scan.nextDouble();
                result = num1 * num1;
                System.out.println("The Square of the number " + num1 + " is = " + result);
            } 
            else if (number == 6) {
                // Square root
                System.out.print("Enter the number to find square root: ");
                num1 = scan.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The Square root of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Error: Square root of a negative number is not possible.");
                }
            } 
            else if (number == 7) {
                // Reciprocal
                System.out.print("Enter the number to find Reciprocal: ");
                num1 = scan.nextDouble();
                if (num1 != 0) {
                    result = 1 / num1;
                    System.out.println("The Reciprocal of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Error: Reciprocal of zero is not defined.");
                }
            } 
            else if (number == 0) {
                
                System.out.println("Invalid choice! Please make a valid choice.");
            } 
            
        } while (number >= 0 && number <= 7); // Keep looping until the user enters any other number to exit.

        System.out.println("Exiting the calculator. Goodbye!");// Exit)
        scan.close();// close scanner
    }
}
