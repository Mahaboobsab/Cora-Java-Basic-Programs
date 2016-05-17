package com.cluster;

import java.util.ArrayList;

public class ArrayListDemo {

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
		
		//can add duplicate and null val in array list
		list.add("A");
		list.add("null");
		
		System.out.println();
		System.out.println("Initial size of the array After adding elments "+list.size());
		System.out.println("Arrat list is empty After adding elments into it "+list.isEmpty());
		System.out.println("Val of array list After adding elments "+list);
		
		boolean b=list.contains("M");
		System.out.println("The val M is present in array list :"+b);
		
		boolean b1=list.contains("Z");
		System.out.println("The val Z is present in array list :"+b1);
		
		boolean b2=list.contains("null");
		System.out.println("The val null is present in array list :"+b2);
		
		//Removing content of P 
		list.remove("P");
		System.out.println("Contents in arrayList After removing P :"+list);
		System.out.println("Initial size of the array After adding elments "+list.size());
		
		//CLearing the contents in list
		list.clear();
		System.out.println();
		System.out.println("Contents in the ArrayList After clearing list : "+list);
		System.out.println("Initial size of the array After clearing elments "+list.size());
		System.out.println("Arrat list is empty After clearing elments into it "+list.isEmpty());
		
	}

}
