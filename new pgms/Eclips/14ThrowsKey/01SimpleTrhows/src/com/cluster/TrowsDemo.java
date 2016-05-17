package com.cluster;

public class TrowsDemo {
	public static void main(String args[]) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		
		System.out.println("Begin main...");
		try
		{
			System.out.println("Begin try in main method...");
			A a=new A();
			a.m1(10, 2);//(10,0)
			System.out.println("End try in main method...");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch "+e);
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch..."+e);
			e.printStackTrace();
		}
		System.out.println("End main method...");
	}

}
