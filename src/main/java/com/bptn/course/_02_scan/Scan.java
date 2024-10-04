package com.bptn.course._02_scan;

import java.util.Scanner;

    public class Scan {


    public static void main(String[] args) {

        // Initialize the Scanner Object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        // Fetch the input from the user and store in the variable called n
        

        int first = 0; // First element of Fibonacci series
        int second = 1; // Second element of Fibonacci series

        System.out.print("Fibonacci Series up to " + n + " elements: ");

        // Print the first n elements of Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(first + "10 ");

            // Fill in the missing piece of code below to print the elelments
           
        }

        scan.close();
    }
    }

