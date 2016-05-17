package com.cluster;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter writer =new PrintWriter(System.out,true);//false
		int i=10;
		String s="Hello";
		double d =10.99;
		writer.println(i);
		writer.println(s);
		writer.println(d);
	}

}
