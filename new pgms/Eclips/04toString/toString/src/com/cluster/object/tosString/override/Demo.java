package com.cluster.object.tosString.override;

public class Demo {

	public static void main(String[] args) {
	Hello h1=new Hello(10,20);
	System.out.println(h1);
	System.out.println(h1.toString());
	Hello h2=new Hello(5,5);
	System.out.println(h2);
	System.out.println(h2.toString());
	}

}
