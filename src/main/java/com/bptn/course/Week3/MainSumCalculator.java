package com.bptn.course.Week3;

public class MainSumCalculator {

public static void main(String[] args) {
	
	    // Create two SumCalculator threads to calculate the sum of two different ranges
        SumCalculator sumCalculator1 = new SumCalculator(1, 50000);
        SumCalculator sumCalculator2 = new SumCalculator(50001, 100000);

        //long startTime = System.currentTimeMillis();
        // Start both threads
        sumCalculator1.start();
        sumCalculator2.start();
        
         //join method
        // Wait for both threads to finish using join() method of each thread.
        // Print the stack trace if an interruption occurs
        try {
			sumCalculator1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			sumCalculator2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //long endTime = System.currentTimeMillis();
        //long elapsedTime = endTime - startTime;

        // Calculate the total sum by adding the sum of both ranges
        int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
        
        // Print the total sum
        System.out.println("Total sum: " + totalSum);
        //System.out.println("Time taken: " + elapsedTime + " milliseconds");
    }
}
