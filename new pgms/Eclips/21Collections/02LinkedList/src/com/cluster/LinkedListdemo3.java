package com.cluster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo3 {

	public static void main(String[] args) {
		
		//can use only Iterator and ListIterator with LinkedList
		LinkedList LinkedList = new LinkedList();
		
		LinkedList.add("A");
		LinkedList.add("S");
		LinkedList.add("G");
		LinkedList.add("B");
		LinkedList.add("C");
		LinkedList.add("J");
		
		//Using Iterator with linkedList
		
		System.out.print("Iterator: ");
		
		Iterator iterator =LinkedList.iterator();
	
		while(iterator.hasNext())
		{
			Object e=iterator.next();
			System.out.println(e+ " ");
		}
		System.out.println();
		
		//UsingListIterator With Linkedlist
		
		System.out.println("ListIterator Forward : ");
		ListIterator listIterator=LinkedList.listIterator();
		while(listIterator.hasNext())
		{
			Object e2=listIterator.next();
			System.out.println(e2+" ");
		}
		

		System.out.println("ListIterator Backward : ");
		
		while(listIterator.hasPrevious())
		{
			Object e3=listIterator.previous();
			System.out.println(e3);
		}
		System.out.println();
	}

}
