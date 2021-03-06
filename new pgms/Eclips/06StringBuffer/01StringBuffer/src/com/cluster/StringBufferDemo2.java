package com.cluster;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		/*// methods of StringBuffer
				StringBuffer sb = new StringBuffer();
				System.out.println("Length of string buffer is "+ sb.length());
				System.out.println("Capacity of string buffer is "+ sb.capacity());
				sb.append("apple");
				System.out.println("Length of string buffer is "+ sb.length());
				System.out.println("Capacity of string buffer is "+ sb.capacity());*/
		/*
		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println("Value of sb1 is " +sb1);
		System.out.println("Length of string buffer is "+ sb1.length());
		System.out.println("Capacity of string buffer is "+ sb1.capacity());
		sb1.append("1234");
		System.out.println("After appending " + sb1);
		sb1.replace(2, 4, "cluster");
		System.out.println("After replacing " + sb1);
		sb1.delete(3,6);
		System.out.println("After deleting " + sb1);
		sb1.insert(5,"A");
		System.out.println("After inserting " + sb1);
		sb1.reverse();
		System.out.println("After reversing " + sb1);*/

		// checking equality of StringBuffer
		// convert StringBuffer to String and call equals()
		// because equals() is not overridden in StringBuffer class
		
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=new StringBuffer("Hello");
		System.out.println("Val of s1 and s2 are equal "+(sb1==sb2));
		System.out.println("Val of s1 and s2 are equal "+sb1.equals(sb2));
		String s1=sb1.toString();
		String s2=sb2.toString();
		System.out.println("Val of s1 and s2 are equal "+(s1==s2));
		System.out.println("Val of s1 and s2 are equal "+s1.equals(s2));
		
		
	}

}
