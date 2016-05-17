package com.cluster;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// array storing primitive data
		int a[]= new int [10];
		a[0]=103;
		a[1]=102;
		a[2]=106;
		a[3]=100;
		a[4]=101;
		
			// finding index or a position of an element in an array
		
		int u=	Arrays.binarySearch(a, 106);
		
		System.out.println("Index of a[] 106 is "+u);
		
		System.out.println();
		
		//Sorting An Array
		
		//Arrays originalorder
		System.out.print("Arrays originalorder :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(a);
		System.out.print("Sorted Order:	 ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		Arrays.fill(a, 2, 5, 2);
		
		
		
		System.out.print("Arrays After filling :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
						
	}

}
