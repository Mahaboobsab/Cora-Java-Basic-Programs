package com.cluster;

import java.util.LinkedHashSet;


public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		System.out.println("Initial size of the linked hashSet Befor Adding elments : "+set.size());
		System.out.println("linkedHashSet is empty befor adding elments : "+set.isEmpty());
		System.out.println("Contents of the linked hashSet befor adding elments : "+set);
		System.out.println();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.add("G");
		
		System.out.println("Initial size of the linked hashSet After Adding elments : "+set.size());
		System.out.println("linkedHashSet is empty After adding elments : "+set.isEmpty());
		System.out.println("Contents of the linked hashSet After adding elments : "+set);
		
		//Cannot Add duplicate val in linked List
		set.add("A");
		System.out.println("Contents of the linked hashSet After adding Duplicate elments : "+set);
		
		//can Add null VAl in LinkedList
		set.add(null);
		System.out.println("Contents of the linked hashSet After adding null elments : "+set);
		
		//check weather elment is present or not
		boolean b=set.contains("E");
		System.out.println("Elment is E  present "+b);
		
		
		boolean b1=set.contains("S");
		System.out.println("Elment is R  present "+b1);
		
		//Remove the elment from the linked list
		
		set.remove("F");
		System.out.println("Contents after removing elment F "+set);
		
		/*boolean l=set.remove("L");
		System.out.println("Contents After removing L "+l);
		System.out.println("Contents after removing elment F "+set);*/
		
		//delete All  elments from the set
		set.clear();
		System.out.println("the size of the set after removingg elments : "+set.size());
		System.out.println("Contents of the linked list after removing elments : "+set);
		
		
		
		


	}

}
