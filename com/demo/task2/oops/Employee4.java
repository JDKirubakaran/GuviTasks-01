package com.demo.task2.oops;

public class Employee4 extends Person4 {
	
	int employeeID;
	double salary;
	 
	// Constructor for Employee class
	public Employee4(String name, int age, int employeeID, double salary) {
	     // Initialize Person attributes using super keyword
	     super(name, age);
	     this.employeeID = employeeID;
	     this.salary = salary;

}
}