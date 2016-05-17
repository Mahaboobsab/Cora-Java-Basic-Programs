package com.cluster;

public class Demo5 {

	public static void main(char[] args) {

		System.out.println("Inside main char parameter");
		/*
		 * for(int i=0;i<args.length;i++) { char c=args[i];
		 * System.out.println(c); }
		 */
		for (char c : args) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside main args...");
		char z[] = { 'A', 'B', 'C' };
		main(z);
	}

}
