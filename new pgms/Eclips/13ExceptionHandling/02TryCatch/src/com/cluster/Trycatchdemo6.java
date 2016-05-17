package com.cluster;

public class Trycatchdemo6 {
	public static void main(String[] args) {
		System.out.println("Begin main.....");
		
		try{
			System.out.println("Begin try...");
			int a[]=new int [5];
			a[9]=109;
			System.out.println(a[3]);
			System.out.println("End Try...");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Begin catch....");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("End catch...");
		}
		System.out.println("End main....");

}
}