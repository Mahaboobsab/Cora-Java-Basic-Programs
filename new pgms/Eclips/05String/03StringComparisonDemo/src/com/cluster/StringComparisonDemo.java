package com.cluster;

public class StringComparisonDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "acd";
		int z = s1.compareTo(s2);// compares with its ascii or unicode val and
									// substract its if coth val are equal then
									// it will ignore it and will moveback next
									// val
		System.out.println(z);
		int b = 'b';
		System.out.println(b);
		int a = 'a';
		System.out.println(a);
	}

}
