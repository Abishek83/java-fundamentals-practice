  



/* 1.Create a class named Student with the instance variable name, phone , address with static values Zake,
123456789, Kathmandu.
Create object studentObject and print each values in the console as shown below.
Output : Zake
123456789
Kathmandu
Zake123456789Kathmandu        Zake 123456789 Kathmandu*/
package com.day2Lab;

public class Student {

    String name;
    String address;
    long phoneNo;


	public static void main(String[] args) {
		 Student studentObj = new Student();
	        studentObj.name = "Abishek";
	        studentObj.address = "ktm";
	        studentObj.phoneNo = 9812231415L;

	        // Printing  each value on a new line
	        System.out.println("\n------------first output ------------");
	        System.out.println(studentObj.name);
	        System.out.println(studentObj.address);
	        System.out.println(studentObj.phoneNo);

	        // Printing the values in a single line without spaces
	        System.out.println("\n******** Second output**********");
	        System.out.print(studentObj.name+studentObj.address+studentObj.phoneNo);
	        
	        // Printing values in a single line with spaces
	        System.out.println("\n\n...........Third output.........");
	        System.out.print("\n" + studentObj.name + " ");
	        System.out.print(studentObj.address + " ");
	        System.out.print(studentObj.phoneNo);
		
	}

}
