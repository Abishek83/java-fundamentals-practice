
/*Create a class TestStatic with a method myStaticMethod and declare it static. 
 * Add code to print text “I am (also with the both instance static and non static variable) 
 *static method” to print in console.
 *Add another method allFreeMethod, 
 *add some to print in the console.
Create object and call above methods.*/




package com.day2Lab;

public class TestStatic {
	// Static instance variable
    static int staticVariable = 10;
    // Non static variable 
     int NonstaticVariable = 10;
     
     // Static method
     static void myStaticMethod() {
         System.out.println("I am static method");
         System.out.println("Value of staticVariable: " +staticVariable);
         // Cannot access non-static variable from a static method
     
     }
     void allFreeMethod() {
         System.out.println("I am a non-static method");
         System.out.println("Value of staticVariable: " + staticVariable);
         System.out.println("Value of nonStaticVariable: " + NonstaticVariable);
     }

	public static void main(String[] args) {
		  // Calling the static method directly
        myStaticMethod();
        // Creating an object to call the non-static method
        TestStatic obj = new TestStatic();
        obj.allFreeMethod();
	
	}

}
