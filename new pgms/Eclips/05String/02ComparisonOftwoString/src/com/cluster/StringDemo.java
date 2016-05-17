package com.cluster;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hai";
		String s4 = "Hai";

		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
		System.out.println(s4.toString());
		
		if(s1==s2)
		{
			System.out.println("S1 & S2 are ref to same object");
		}
		else
		{
			System.out.println("S1 & S2 are ref to different object");
		}
		if(s3==s4)
		{
			System.out.println("S3 & S4 are ref to same object");
		}
		else
		{
			System.out.println("S3 & S4 are ref to different object");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("S1 & S2 have same values ");
		}
		else
		{
			System.out.println("S1 & S2 have different val");
		}
		if(s3.equals(s4))
		{
			System.out.println("S3 & S4 have same values ");
		}
		else
		{
			System.out.println("S3 & S4 have different val");
		}
			
	}

}
