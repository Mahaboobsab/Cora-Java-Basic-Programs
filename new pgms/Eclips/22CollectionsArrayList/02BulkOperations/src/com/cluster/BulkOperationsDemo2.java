package com.cluster;

import java.util.ArrayList;

public class BulkOperationsDemo2 {

	public static void main(String[] args) {
		ArrayList list1= new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		System.out.println("Original Array List : "+list1);
		
		ArrayList list2= new ArrayList();
		list2.add("100");
		list2.add("101");
		list2.add("102");
		list2.add("103");
		list2.add("104");
		list2.add("105");
		
		System.out.println("Initial VAl of List2 Befor Adding : "+list2);
		list2.addAll(2, list1);
		System.out.println("val in list2 After Adding At 2 index " +list2);
		
	}

}
