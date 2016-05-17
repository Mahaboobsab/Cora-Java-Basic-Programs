package com.cluster.object.finalize;

public class A {
	A()
	{
		System.out.println("Initializing Resorces....");
	}
void m1()
{
	System.out.println("Inside m1method.....");
	}
void m2()
{
	System.out.println("Inside m2 method......");
	}
public void finalize()
{
	System.out.println("Cleaning the initialized Resorces....");
	}
}
