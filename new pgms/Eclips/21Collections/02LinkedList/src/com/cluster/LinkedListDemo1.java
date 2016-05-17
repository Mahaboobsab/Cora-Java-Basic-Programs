package com.cluster;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	System.out.println("Intitial Size of LinkedList befor adddind elments "+list.size());
	System.out.println("LinkedList is emplty befor addind elments "+list.isEmpty());
	System.out.println("Contents of linkedList Befor adding values "+list);
	
	//Adding elments or values to the LinkedList
	list.add("A");
	list.add("H");
	list.add("C");
	list.add("G");
	list.add("B");
	list.add("D");
	
	//Can add Duplicates and null values in linkedList
	
	list.add("A");//Duplicates
	list.add(null);
	System.out.println("Intitial Size of LinkedList befor adddind elments "+list.size());
	System.out.println("LinkedList is emplty befor addind elments "+list.isEmpty());
	
	//Displays the content of linkedList
	System.out.println("Contents of linkedList After adding values "+list);
	
	//Check weather elments present
	boolean b=list.contains("H");
	System.out.println("H is present..."+b);
	
	boolean bb=list.contains("M");
	System.out.println("M is present..."+bb);
	
	//Remove the elments from the linked list
	
	list.remove("B");
	System.out.println("Intitial Size of LinkedList After deletion elments "+list.size());
	System.out.println("Contents of linkedList After adding values "+list);
	
	
	

	}

}
