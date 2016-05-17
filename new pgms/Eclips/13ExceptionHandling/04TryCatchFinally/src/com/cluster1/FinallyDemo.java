package com.cluster1;

class Test
{
	void m1(int x,int y)
	{
		System.out.println("Inside m1 method in class Test");
		
		try
		{
			int z;
			z=x/y;
			System.out.println("The result is "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch..."+e);
		}
		finally
		{
			System.out.println("Inside finally");
		}
		
		System.out.println("End of Test....");
	}
	
	}





public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		Test t=new Test();
		t.m1(10,2);//(10,0)
		System.out.println("End main...");
	}

}
