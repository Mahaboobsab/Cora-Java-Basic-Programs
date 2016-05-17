package com.cluster;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int i=10;
		int j=20;//10
		System.out.println("VAl of i is "+i);
		System.out.println("VAl of j is "+j);
		Integer x =new Integer(i);//Boxing
		Integer y =new Integer(j);//Boxing
		System.out.println("Val of x is "+x);
		System.out.println("Val of y is "+y);
		boolean b=x.equals(y);
		if(b)
		{
			System.out.println("The are equal...");
		}
		else 
		{
			System.out.println("The are not equal...");
		}
	}

}
