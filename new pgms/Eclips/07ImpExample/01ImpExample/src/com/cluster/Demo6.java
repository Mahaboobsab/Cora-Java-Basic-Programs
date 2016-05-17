package com.cluster;

public class Demo6 {
	public static void main(String[] args) {
		System.out.println("Insisde main args...");
	}

	public static void main(int i)// method overloding is poooosible but main
									// whic is comtainingstriing is executd
									// first
	{
		System.out.println("Insisde main int parameter...");
	}

}
