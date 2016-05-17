package com.cluster;

public class Trycatchdemo1 {
	public static void main(String[] args) {
		System.out.println("Begin main....");
		int x = 10;
		int y = 0;
		int z = 0;

		try {
			System.out.println("Begin try...");
			z = x / y;
			System.out.println("Val of z after div is..." + z);
			System.out.println("End try...");
		} catch (ArithmeticException e) {
			System.out.println("Begin catch....");
			System.out.println(e);
			System.out.println("End catch......");
		}
		System.out.println("End main......");
	}

}
