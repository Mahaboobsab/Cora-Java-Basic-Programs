package com.cluster;

public class ArrayUDDDemo {

	public static void main(String[] args) {
		Box[]z;//Declaring of array
		z=new Box[5];//creating of an aarray
		for (int i = 0; i < z.length; i++) {
			System.out.println("Val in "+i+" index is "+z[i]);
		}
	}

}
