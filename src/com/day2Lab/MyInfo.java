


/*3. Create a class MyInfo with attribute name = "Zake”, address= “Kathmandu”, phone = “123456789” all private.
Create object print the values of each instance variable. Check the output.
Now change the value of each instance variables to “Jolie”, “Lalitpur”, “987654321” and print in the console.*/


package com.day2Lab;

public class MyInfo {
	 private String name = "Zake";
	    private String address = "Kathmandu";
	    private long  phone = 9815161718L;


	public static void main(String[] args) {
		 MyInfo obj =new MyInfo();

	        // Printing the initial values
	        System.out.println("\n*****Initial Values********\n");
	        System.out.println("Name: " + obj.name);
	        System.out.println("Address: " + obj.address);
	        System.out.println("Phone: " + obj.phone);
	        
	        // Changing  the values
	        System.out.println("\n-----Changing values of the instances -------\n");
	        System.out.println(obj.name = "Jolie");
	        System.out.println(obj.address = "Lalitpur");
	        System.out.println(obj.phone = 9876543211L);
	        // Printing the updated values
	        System.out.println("\n........now the updated values......\n");
	        System.out.println("\nUpdated Values:");
	        System.out.println("Name: " + obj.name);
	        System.out.println("Address: " + obj.address);
	        System.out.println("Phone: " + obj.phone);

	}
}
