package com.cluster;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

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
		
		
		System.out.println("Initial size of the array After adding elments "+list.size());
		System.out.println("Arrat list is empty After adding elments into it "+list.isEmpty());
		System.out.println("Val of array list After adding elments "+list);
		
		//trimsTosize() trims the array size to current current size
		list.trimToSize();
		System.out.println("Initial size of the array After trimToSize elments "+list.size());
		System.out.println("Contents of Array list :"+list);
		
		int i=list.indexOf("M");
		System.out.println("Index of M is "+i);
		
		// clone method will copy the values into another ArrayList
		
		ArrayList  AnotherList=(ArrayList)list.clone();
		System.out.println("Size of the another list is "+AnotherList.size());
		System.out.println("Contents of the another list :"+AnotherList);
		
		// subList() returns a portion of the list depending on the range
	    List li=list.subList(2, 5);
	    System.out.println("VAl present in subList are "+li);
	    System.out.println("Contents of array list "+list);
	    

		

}
	}

