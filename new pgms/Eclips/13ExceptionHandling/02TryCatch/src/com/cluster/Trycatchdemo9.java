package com.cluster;

public class Trycatchdemo9 {
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

		/*
		 * catch (Exception e) { Compilation Error It should come last
		 * System.out.println("Inside catch exception e");
		 * System.out.println(e); }
		 */
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside ArrayIndexOutOfBoundsException e");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("Inside ArithmeticException e");
			System.out.println(e);
		}

		catch (Exception e) {
			System.out.println("Inside catch exception e");
			System.out.println(e);
		}
	}

}
