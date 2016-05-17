package com.cluster;

public class SingletonDemo {
	public static void main(String args[]) {
		// Hello h= new Hello();
		Hello h1 = Hello.getHello();
		Hello h2 = Hello.meheboob();
		System.out.println("VAl of h1 is " + h2);
		h1.m1();
		h1.m2();

		Hello h3 = Hello.getHello();
		System.out.println("Val of h2 " + h3);

	}

}
