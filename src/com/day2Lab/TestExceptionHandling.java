/*Create a class TestExceptionHandling with main method.
 *  Inside main method assign 100/0 to variable
divideByZero. Run the program.
Hints: Surround with try catch block and finally*/




package com.day2Lab;

public class TestExceptionHandling {
	
	public static void main(String [] args)
	
	
	{
		int   divideByZero;
		try
		{
			divideByZero=100/0;//// This will cause an ArithmeticException
			System.out.println("result :"+divideByZero);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Caught:" +e.getMessage());
		}finally
		{
			System.out.println("This block is always executed, regardless of an exception.");
		}

        System.out.println("Program execution continues...");
		
	}

}
