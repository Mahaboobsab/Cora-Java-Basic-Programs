package com.cluster;

public class SystemDemo {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("osname"));
		System.out.println(System.getProperty("User name"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getenv("path"));
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("Windows edition"));
		System.out.println(System.getProperty("date"));
		System.out.println(System.getProperty("os"));
		
		
		//System.out.println(System.getProperties());

	}

}
