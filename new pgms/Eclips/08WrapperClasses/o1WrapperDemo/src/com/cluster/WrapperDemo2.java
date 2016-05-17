package com.cluster;

public class WrapperDemo2 {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;// 10
		
		
		System.out.println("VAl of i is " + i);
		System.out.println("VAl of j is " + j);
		
		Integer x = new Integer(i);// Boxing
		Integer y = new Integer(j);// Boxing
		
		System.out.println("Val of x is " + x);
		System.out.println("Val of y is " + y);
		
		int z=x.compareTo(y);//gives 3 values 1,0,-1
		System.out.println("Val of z is "+z);
		
	}

}
