package com.cluster1;

public class Hello {
	void m1(int x,int y)
	{
		System.out.println("Inside m1 method...");
		try
		{
			int z=0;
			z=x/y;
			System.out.println("Val of z is.."+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch of Hello");
			System.out.println("Pleas Enter proper values...");
			int p=10;
			int q=2;
			int r=0;
			r=p/q;
			System.out.println("Result of div is..."+r);
		}
		System.out.println("End m1 method");
	}

}
