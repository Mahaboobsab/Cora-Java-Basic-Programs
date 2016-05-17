package com.cluster;

public class WrapperDemo3 {
	public static void main(String[] args) {
		
		System.out.println("MAX val of integer is "+Integer.MAX_VALUE);
		System.out.println("MAX val of integer is "+Integer.MIN_VALUE);
		Integer x=10;//implicit Boxing
		System.out.println(x);
		int i=x;
		System.out.println(i);//implicit unboxing
		
	}

}
