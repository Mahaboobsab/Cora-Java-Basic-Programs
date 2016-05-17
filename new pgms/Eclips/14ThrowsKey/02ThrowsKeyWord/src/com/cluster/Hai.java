package com.cluster;

public class Hai {
	void m1(int x,int y)throws ArithmeticException
	{
		if(x==0 && y==0)
		{
			throw new ArithmeticException();
			//System.out.println("Hello...");
		}
		else
		{
			int p=x/y;
			System.out.println("Val of p is "+p);
		}
	}

}
