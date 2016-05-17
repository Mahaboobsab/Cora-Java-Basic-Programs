package com.cluster;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	System.out.println("Begin main...");
	int x=20;
	int y=10;
	int z=0;
	System.out.println("Val of x befor div is..."+x);
	System.out.println("Val of y befor div is..."+y);
	System.out.println("Val of z befor div is..."+z);
	z=x/y;
	System.out.println("Val of x After div is..."+x);
	System.out.println("Val of y After div is..."+y);
	System.out.println("Val of z After div is..."+z);
	}

}
