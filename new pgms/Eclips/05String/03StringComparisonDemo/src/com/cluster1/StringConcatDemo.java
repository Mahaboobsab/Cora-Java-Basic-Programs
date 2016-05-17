package com.cluster1;

public class StringConcatDemo {

	public static void main(String[] args) {
		/*String s1 = "a";
		System.out.println("Value of s1 is " + s1);
		String s2 = s1 + "b";
		System.out.println("Value of s1 is " + s1);
		System.out.println("Value of s2 is " + s2);
		s1 = s1 + "c";
		System.out.println("Value of s1 is " + s1);
		System.out.println("Value of s2 is " + s2);

		String s3 = "a";
		System.out.println("Value of s3 is " + s3);
		String s4 = s3.concat("b");
		System.out.println("Value of s3 is " + s3);
		System.out.println("Value of s4 is " + s4);
		s3 = s3.concat("c");
		System.out.println("Value of s3 is " + s3);
		System.out.println("Value of s4 is " + s4);*/
		/*String s1="a";
		System.out.println("val of s1 is  "+s1);
		String s2="b";
		String s3="c";
		System.out.println("val of s1 is  "+s1);
		System.out.println("val of s1 is  "+s2);
		System.out.println("val of s1 is  "+s3);
		String s4=s1.concat(s2).concat(s3);
		System.out.println("Val of s4 is "+s4);*/
		String s1="1";
		System.out.println("val of s1 is  "+s1);
		String s2="2";
		String s3="3";
		System.out.println("val of s1 is  "+s1);
		System.out.println("val of s1 is  "+s2);
		System.out.println("val of s1 is  "+s3);
		//String s4=s1.concat(s2).concat(s3);
		String s4=s1+s2+s3;
		System.out.println("Val of s4 is "+s4);
	}

}
