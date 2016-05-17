package com.cluster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("M");
		linkedList.add("E");
		linkedList.add("H");
		linkedList.add("E");
		linkedList.add("B");
		linkedList.add("O");
		linkedList.add("O");
		linkedList.add("B");

		System.out.println("Using Iterator: ");
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Object e = iterator.next();
			System.out.println(" " + e);
		}
		System.out.println("End Iterator");

		// Using Listiterator Forward
		System.out.println("Using listIterator Forward: ");
		ListIterator listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			Object e2 = listIterator.next();
			System.out.println(" " + e2);
		}
		System.out.println("End listIterator");
		
		System.out.println("Using listIterator backward: ");
		while(listIterator.hasPrevious())
		{
			Object e3=listIterator.previous();
			System.out.println(e3);
		}
		System.out.println("End listIterator backward");
	}

}
