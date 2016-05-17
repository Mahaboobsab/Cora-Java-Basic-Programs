package com.cluster1;

public class TryCatchdemo1 {
	public static void main(String[] args) {
		System.out.println("Begin main method...");
		Hello1 h1 = null;
		int a = 10;
		int b = 0;
		try //Fixing the problem in Hello1 class is wring approch
		{
			h1 = new Hello1();
			h1.m1(a, b);
		} 
		
		catch (ArithmeticException e)
		{
			System.out.println("Inside catch...");

			int p = 10;
			int q = 2;
			h1.m1(p, q);

		}
		System.out.println("End main method...");
	}

}
