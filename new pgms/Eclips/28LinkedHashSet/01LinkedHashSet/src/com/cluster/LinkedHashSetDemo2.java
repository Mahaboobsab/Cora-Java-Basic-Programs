package com.cluster;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		//Cannot Add duplicats in LinkdHashSet
		
		set.add("A");
		//Can add dissimilor and null val in LinkedList
		set.add(new Integer(100));
		set.add(null);
		System.out.println("Contents in Set : "+set);
		

	}

}
