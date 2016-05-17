package com.cluster;

public class ExceptionHandlingDemo2 {
	public static void main(String[] args)
	{
		System.out.println("Begin main.....");
		int a[] = new int[5];
		
		a[9]=109;//ERROR
		System.out.println("End main......");
	}

}
