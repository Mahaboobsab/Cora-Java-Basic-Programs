package com.cluster;

public class WrapperDemo {

	public static void main(String[] args) {
		int i=10;
		System.out.println("Val of i is "+i);
		Integer x=new Integer(i);//Boxing
		System.out.println("VAl of x is "+x);
		int p=x.intValue();//unboxing
		System.out.println("VAl of p is "+p);
				
	}

}
