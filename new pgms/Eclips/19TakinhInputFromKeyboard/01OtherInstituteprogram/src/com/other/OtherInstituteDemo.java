package com.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherInstituteDemo {

	public static void main(String[] args)throws IOException
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Plaese Enter first val ");
		String s1=reader.readLine();
		int x=Integer.parseInt(s1);
		System.out.println("Plaese Enter second val ");
		String s2=reader.readLine();
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println("Val of x is "+x);
		System.out.println("Val of y is "+y);
		System.out.println("Val of z is "+z);
	}

}
