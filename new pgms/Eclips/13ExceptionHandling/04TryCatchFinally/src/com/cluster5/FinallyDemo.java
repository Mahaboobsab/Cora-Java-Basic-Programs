package com.cluster5;

class Fun
{
	int m1(int x,int y)
	{
		int z=0;
		try
		{
			System.out.println("Begin Try");
		     z=x/y;
			return z;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch");
			return z;
		}
		finally
		{
			System.out.println("Inside Finally...");
			System.out.println("val of x is "+x);
			System.out.println("val of y is "+y);
			System.out.println("val of z is "+z);
		}
	}
	
}



public class FinallyDemo {
	public static void main(String args[])
	{
		Fun f = new Fun();
		//f.m1(10,0);
		int res=f.m1(10, 2);
		System.out.println("Val of res is "+res);
		
	
		
	}
	

}

