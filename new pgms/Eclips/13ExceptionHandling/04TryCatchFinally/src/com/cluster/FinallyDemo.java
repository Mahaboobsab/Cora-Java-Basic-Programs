package com.cluster;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Begin main....");
		int x = 10;
		int y = 2;
		int z = 0;
		try
		{
			System.out.println("Begin try...");
			z = x / y;
			System.out.println("The result of z is..." + z);
			System.out.println("End try....");
		} 
		catch (ArithmeticException e) {
			System.out.println("Inside cattch" + e);

		} 
		finally 
		{
			System.out.println("inside Finally ...");
		}
		System.out.println("End main....");
	}

}
