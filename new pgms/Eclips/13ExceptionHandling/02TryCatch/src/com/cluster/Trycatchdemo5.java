package com.cluster;

public class Trycatchdemo5 {

	public static void main(String[] args) {
		System.out.println("Begin main.....");
		
		try{
			System.out.println("Begin try...");
			int a[]=new int [5];
			a[3]=109;
			System.out.println(a[3]);
			System.out.println("End Try...");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Begin catch....");
			System.out.println(e);
			System.out.println("End catch...");
		}
		System.out.println("End main....");
	}
}
