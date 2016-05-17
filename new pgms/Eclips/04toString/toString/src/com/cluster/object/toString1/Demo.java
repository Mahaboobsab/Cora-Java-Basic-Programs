package com.cluster.object.toString1;

public class Demo {

	public static void main(String[] args) {
		Hello h1=new Hello(10,20);
		System.out.println(h1.hashCode());
		System.out.println(h1);//Implicitly overridden toString()
		System.out.println(h1.toString());//
	}

}
