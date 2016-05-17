package com.cluster.boxing;

public class BoxingDemo1 {

	public static void main(String[] args) {
		int i = 10;

		Integer x = new Integer(i);// Explicit Boxing
		
		x++;
		System.out.println("VAl of x is "+x);
	}

}
