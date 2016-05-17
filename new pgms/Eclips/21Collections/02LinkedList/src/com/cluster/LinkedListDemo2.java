package com.cluster;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Intial size of linked list befor ddind elmnts is "+list.size());
		System.out.println("LinkedList is empty befor adding elments "+list.isEmpty());
		System.out.println("Val of linkedList Befor adding eelments is "+list);
		
		//Sdding Vslues
		
		list.add("A");
		list.add("H");
		list.add("K");
		list.add("C");
		list.add("J");
		list.add("B");
		
		//CAn add duplicats,null and Disssimilor
		list.add("A");
		list.add(null);
		list.add(new Integer(10));
		
		//can add an elment by specifying index by using overloaded add()
		list.add(2, "P");
		
		System.out.println("Intial size of linked list befor ddind elmnts is "+list.size());
		System.out.println("LinkedList is empty After adding elments "+list.isEmpty());
		System.out.println("Val of linkedList After adding eelments is "+list);
		
		//Fetching the perticulor val from linkedList
		
		Object e1=list.get(3);
		String s1=(String)e1;
		

		Object e2=list.get(5);
		String s2=(String)e2;
		
		System.out.println("Val present at index no 3 is "+s1);
		System.out.println("Val present at index no 5 is "+s2);
		
		//Replace index At perticulor index
		
		list.set(1, "Q");
		System.out.println("Val of linkedList After adding eelments is "+list);
		
		//remove elments from loinkedList
		
		list.remove("K");
		list.remove(2);
		System.out.println("Intial size of linked list befor ddind elmnts is "+list.size());
		System.out.println("Val of linkedList After Deleting k and p eelments is "+list);
		
		//Delete all elments from linkedlidt
		
		list.clear();
		System.out.println("Intial size of linked list After clearing elmnts is "+list.size());
		System.out.println("LinkedList is empty After clearing elments "+list.isEmpty());
		System.out.println("Val of linkedList After clearing eelments is "+list);
	
	}

}
