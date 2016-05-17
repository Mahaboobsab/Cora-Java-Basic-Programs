package com.cluster;

import java.util.Arrays;
import java.util.List;

public class ArraysToArrayListDemo2 {

	public static void main(String[] args) {
		Integer ia[]= new Integer[5];
		ia[0]= new Integer(10);
		ia[1]=new Integer(20);
		ia[2]=new Integer(30);
		ia[3]=new Integer(40);
		ia[4]=new Integer(50);
		List list = Arrays.asList(ia);
		System.out.println("Values in the Integer Array list are : "+list);
		
		
				
	}

}
