
/*Create a class TestConstructor with instance variable name. 
 * Create constructor and assign the value to
the name field and print in the console.
Add address and phoneNumber field. 
Create parameterized constructor which takes two string
parameters param1 and param2 that is to be assigned to address and phoneNumber. Assign values to
address and phoneNumber and print in the console.*/




package com.day2Lab;

public class TestConstructor {
	
	String Name;
	String Address;
	long PhoneNo=981213141516L;
	    // Default constructor
	
	TestConstructor()
	{
		Name="Abishek Mishra";
		System.out.println("Name:"+Name);
	}
	// Parameterized Constructor 
	 TestConstructor(String Param1, long Param2)
	 {
		 Address=Param1;
		 PhoneNo=Param2;
		 System.out.println("Address:"+ Address);
		 System.out.println("PhoneNo:"+PhoneNo);
	 }
	

	public static void main(String[] args) {
		  // Creating an object and calling the default constructor
		TestConstructor obj1 =new TestConstructor();
		
	    // Creating another object and calling the parameterized constructor
		TestConstructor obj2 =new TestConstructor("Kathmandu", 9815637337L);

	}

}
