

/*Create a class MyStudent with attribute name, address, phone all private. Create object print the values
of each instance variable. Check the output.
Now create object or use the same object to assign the value of each instance variables and print in the
console. Check the output*/

package com.day2Lab;

public class MyStudent {
	private String Name ;
	private String Address;
	private long PhoneNo;
	 boolean  isSunny;

	public static void main(String[] args) {
		MyStudent MyStudentobj=new MyStudent();
		System.out.println(MyStudentobj.Name+MyStudentobj.Address+MyStudentobj.PhoneNo+MyStudentobj.isSunny);
		System.out.println(MyStudentobj.Name="Abishek");
		System.out.println(MyStudentobj.Address="Kathmandu");
		
		System.out.println(MyStudentobj.PhoneNo=9815650334L);
			

	}

}
