package com.cluster;

public class A {
	void m1(int x,int y)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		System.out.println("Begin m1 method...");
		int p=x/y;
		System.out.println("Val of div is ..."+p);
		B b =new B();
		b.m2();
		System.out.println("End of m1...");
	}

}


