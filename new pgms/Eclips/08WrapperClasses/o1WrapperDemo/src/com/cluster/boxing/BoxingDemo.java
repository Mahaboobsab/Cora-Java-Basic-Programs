package com.cluster.boxing;

public class BoxingDemo {

	public static void main(String[] args) {
		int i = 10;
		
		Integer x = new Integer(i);//Explicit Boxing
		Integer y=i;//Implicit Boxing
		
		System.out.println("Val of x is "+x);
		System.out.println("Val of y is "+y);
		
		Integer m=100;//Implicit Boxing
		System.out.println("VAl oF m is "+m);
	}

}
