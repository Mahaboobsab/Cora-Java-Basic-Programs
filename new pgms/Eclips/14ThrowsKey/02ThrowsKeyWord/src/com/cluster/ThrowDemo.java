package com.cluster;

public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		Hai h=null;
		try
		{
			h=new Hai();
			h.m1(10,0);//(0,0)
		}
		catch (ArithmeticException e)
		{
			System.out.println("Inside catch of main "+e);
			h.m1(10,2);
		}
		System.out.println("End main....");
	}

}
