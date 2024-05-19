
/*4.Create a class MyClassOne with instance variable name, address, phone. Initialize address with the
values Kathmandu and make it as final variable. Assign “John” to name and “123” to phone variable.
Create an object print all values in console. Now change the value of address variable to Lalitpur.*/




package com.day2Lab;

public class MyClass {
	String name = "John";
    final String address = "Kathmandu"; // final variable
    long phone = 9815181726L;

	public static void main(String[] args) {
		 MyClass  obj=new  MyClass();

	        // Printing  the initial values
	        System.out.println(".......Initial Values.........");
	        System.out.println("Name: " + obj.name);
	        System.out.println("Address: " + obj.address);
	        System.out.println("Phone: " + obj.phone);
	        String address = "Lalituur";                    //local varible 
	        System.out.println("Address: " + obj.address);

	        /*The line System.out.println("Address: " + obj.address); 
	        prints the value of the instance variable obj.address,
	        which is still "Kathmandu" because
	        it was declared as a final variable and cannot be changed after initialization.*/
	        
	        
	        
	     System.out.println("Address: " + obj.address);

	
	}

}
