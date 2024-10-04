package com.bptn.course.Week2;

public class Employee {
	// Instance variable to store salary
	   private int salary;
	       
	   // Instance variable to store hours per day worked by employee
	   private int hoursPerDay;

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   public Employee(int salary, int hoursPerDay) {
	      this.salary = salary;
	      this.hoursPerDay = hoursPerDay;
	      setSalary(salary);
	      sethoursPerDay(hoursPerDay);
	   }

	   // Set method to update salary
	   public void setSalary(int salary) {
	      this.salary = salary;
	      if (this.salary < 500) {
	         this.salary += 10; 
	      }
	   }

	   // Set method to update hoursPerDay
	   public void sethoursPerDay(int hoursPerDay) {
	      this.hoursPerDay = hoursPerDay;
	      if (this.hoursPerDay > 6) {
	         this.salary += 5;
	      }
	   }

	   // Get method to return salary
	   public int getSalary() {
	      return salary;
	   }
	}
