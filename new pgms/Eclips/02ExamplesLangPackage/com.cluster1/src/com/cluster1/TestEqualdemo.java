package com.cluster1;

public class TestEqualdemo {

	public static void main(String[] args) {
		Test t1=new Test(10,20);
		Test t2=new Test(10,20);
		Test t3=new Test(5,5);
		Test t4=new Test(10,50);
		if(t1.equals(t1))
		{
			System.out.println("The are equal...");
		}
		else
		{
			System.out.println("Th are not equal...");
		}

	}

}
