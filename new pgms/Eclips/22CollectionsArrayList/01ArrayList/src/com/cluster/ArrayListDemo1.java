package com.cluster;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
ArrayList list=new ArrayList();
		
		System.out.println("Initial size of the array befor adding elments "+list.size());
		System.out.println("Arrat list is empty beor adding elments into it "+list.isEmpty());
		System.out.println("Val of array list BEfor adding elments "+list);
		System.out.println();
		
		list.add("A");
		list.add("M");
		list.add("L");
		list.add("J");
		list.add("I");
		list.add("Y");
		list.add("P");
		
		//can add duplicate and null val in array list
		list.add("A");
		list.add("null");
		list.add(new Integer(10));
		
		// can add an element at a specific index by using overloaded add() method
		list.add(4, "S");
		
		System.out.println("Initial size of the array After adding elments "+list.size());
		System.out.println("Arrat list is empty After adding elments into it "+list.isEmpty());
		System.out.println("Val of array list After adding elments "+list);
		
		// Fetching a particular element from an ArrayList
		
		Object e=list.get(3);
		String s=(String)e;
		
		Object e1=list.get(5);
		String s1=(String)e1;
		
		System.out.println("Val present at Specific index 3 is "+s);
		System.out.println("Val present at Specific index 5 is "+s1);
		
		//Replacing elment at perticulor elment
		list.set(2, "F");
		System.out.println("Val of array list After adding elments "+list);
		
		//Removing elments from the array list
		list.remove(4);
		list.remove("F");
		System.out.println("Val of array list After adding elments "+list);
		
		list.clear();
		System.out.println("Initial size of the array After adding elments "+list.size());
		System.out.println("Arrat list is empty After adding elments into it "+list.isEmpty());
		System.out.println("Val of array list After adding elments "+list);
	}

}
