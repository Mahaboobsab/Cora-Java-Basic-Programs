package com.cluster;

public class Trycatchdemo8 {
	public static void main(String[] args) {
		System.out.println("Begin main.....");

		try {
			System.out.println("Begin try...");

			int x = 10;
			int y = 2;
			int z = 0;
			z = x / y;
			System.out.println("Val of z after div is..." + z);

			int a[] = new int[5];
			a[9] = 109;
			System.out.println("End Try...");
		}

		catch (Exception e) {// Exception e is super class of all Exceptions &
								// it will work for all exceptions
			System.out.println("Inside catch exception e");
			System.out.println(e);
		}

	}
}