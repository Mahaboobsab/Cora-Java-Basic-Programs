package com.cluster;

public class Demo {

	public static void main(String[] args) {
	Box b1=new Box(1,2,3);
	Class c1=b1.getClass();
	Test t1=new Test(10,20);
	Class c2=t1.getClass();
	Box b2=new Box(5,5,5);
	Class c3=b2.getClass();
	System.out.println("Val of c1 is  "+c1);
	System.out.println("Val of c2 is   "+c2);
	System.out.println("Val of c3 is   "+c3);
    t1.fun();

	

	}

}
