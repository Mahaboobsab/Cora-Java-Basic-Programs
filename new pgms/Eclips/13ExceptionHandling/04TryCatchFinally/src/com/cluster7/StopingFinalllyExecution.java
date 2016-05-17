package com.cluster7;



class Test10
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
			System.exit(10);
			System.out.println("Inside finally");
		}
		
		System.out.println("End of Test....");
	}
	
	}





public class StopingFinalllyExecution {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		Test10 t=new Test10();
		t.m1(10,2);//(10,2)
		System.out.println("End main...");
	}

}




