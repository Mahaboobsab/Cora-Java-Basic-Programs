package com.cluster.widning.boxingVarargs;

public class Hello {
	/*void m1(int x, int y)// widning 1st preference
	{
		System.out.println("Inside m1 int " + x + y);
	}
*/
	void m1(Integer x, Integer y)// Boxingng 2 preference//it takes only int
	{
		System.out.println("Inside m1 Integer x " + x + y);
	}

	void m1(int... x)// varrags 3 preference
	{
		System.out.println("Inside m1 vraargs...");
	}

}
