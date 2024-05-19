/*    Create a class MyMultipleObj with instance variable x with initial value 100, 
 *     Create object myObjectOne  and myObjectTwo. 
 *    With myObjectTwo assign the value of instance variable x to 111.  
       Print the value of x with above two objects. */




package com.day2Lab;

public class MyMuntipleObj {
	int x =100;                       // instance variable 

	public static void main(String[] args) {
		
		MyMuntipleObj  myObjectOne =new MyMuntipleObj();
		MyMuntipleObj  myObjectTwo =new MyMuntipleObj();
		
		  // Modifying  the value of x for myObjectTwo
		 myObjectTwo.x=111;

	        // Printing  the values of x for both objects
	        System.out.println("Value of x for myObjectOne: " + myObjectOne.x);
	        System.out.println("Value of x for myObjectTwo: " + myObjectTwo.x);
	}
}
	        
	        /*When you create multiple objects of a class, 
		 * each object has its own set of instance variables,
		 *  and modifying the value of an instance variable in one object 
		 *  does not affect the same instance variable in other objects.
		*/
	
