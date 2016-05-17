package com.cluster;

public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory is :"+r.totalMemory());
		System.out.println("Total free Memory is :"+r.freeMemory());
		/*System.out.println("available processor "+r.availableProcessors());
		int s=r.availableProcessors();
		System.out.println(s);
		*/
	}

}
