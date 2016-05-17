package com.cluster;

public class Hello {
	private static Hello h;//private and static membor of the same class

	static {//Ststic block which creates objects & initiats the static variablee
		System.out.println("Inside static...");
		h = new Hello();
	}

	private Hello() {//private constructor
		System.out.println("Inside constructor...");
	}

	public static Hello getHello() {//static method which returns the ref of the object
		System.out.println("Inside getHello()..." + h);
		return h;
	}
	public static Hello meheboob() {//static method which returns the ref of the object
		System.out.println("Inside meheboob()..." + h);
		return h;
	}

	void m1() {//Extra membors
		System.out.println("Inside m1....");
	}

	void m2() {
		System.out.println("Inside m2....");
	}

}
