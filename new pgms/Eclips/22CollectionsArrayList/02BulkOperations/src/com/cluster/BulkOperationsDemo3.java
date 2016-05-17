package com.cluster;

import java.util.ArrayList;

public class BulkOperationsDemo3 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");

		System.out.println("VAl present in ArrayList1 is :" + list1);

		ArrayList list2 = new ArrayList();
		list2.add("100");
		list2.add("101");
		list2.add("102");
		list2.add("103");
		list2.add("104");
		list2.add("105");

		System.out.println("Val present in Arraylist2 is : " + list2);
		System.out.println();
		// To check list2 contains VAl of list1
		boolean b = list2.containsAll(list1);

		System.out
				.println("Second ArrayList COntains All the VAl of first ArrayList :"
						+ b);
		System.out.println();
		list2.addAll(list1);
		System.out
				.println("Val present in Arraylist2 After Adding ArrayList1 is : "
						+ list2);

		/*list2.removeAll(list1);
		System.out
				.println("Val of the second ArrayList After removingg first ArrayLList : "
						+ list2);*/
		System.out.println();

		list2.retainAll(list1);
		System.out.println("Val in the second ArrayList Afetr Retaining : "
				+ list2);
	}

}
