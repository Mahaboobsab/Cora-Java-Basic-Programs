package com.cluster.sorting;

import java.util.Arrays;

public class SortingName {

	public static void main(String[] args) {
		String s[]= new String[11];
		s[0]="S";
		s[1]="A";
		s[2]="Y";
		s[3]="Y";
		s[4]="A";
		s[5]="D";
		s[6]="B";
		s[7]="A";
		s[8]="Y";
		s[9]="Y";
		s[10]="A";
		
		
		System.out.print("Original Order: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+"  ");
			
		}
		System.out.println();
		
		
		Arrays.sort(s);
		System.out.print("Sorted Order: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+"  ");
			
		}
		

	}

}
