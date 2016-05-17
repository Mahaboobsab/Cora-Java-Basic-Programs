package com.cluster1;

public class ThrowDemo3 {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		try 
		{
			String s1 = "Hello";
			int p = Integer.parseInt(s1);
			System.out.println("Val of p is " + p);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("Inside catch...");
			String s2 = "999";
			int q = Integer.parseInt(s2);
			System.out.println("Val of s2 in catch is " + q);
		}
		finally 
		{
			System.out.println("Inside finally");
		}
		System.out.println("End main...");

	}

}
