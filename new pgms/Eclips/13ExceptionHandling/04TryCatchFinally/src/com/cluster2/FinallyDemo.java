package com.cluster2;

class Test1
{
	void m1(int x,int y)
	{
		System.out.println("Inside m1 method in class Test");
		
		try
		{
			int z;
			z=x/y; // Exception occurs.  JVM identifies and creates a corresponding exception object.
			System.out.println("The result is "+z);
		}
		catch(ArrayIndexOutOfBoundsException e)
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
		Test1 t=new Test1();
		t.m1(10,0);//(10,2)
		System.out.println("End main...");
	}

}



