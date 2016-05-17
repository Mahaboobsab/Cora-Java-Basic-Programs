package com.cluster;

import java.util.ArrayList;
import java.util.LinkedList;

public class BulkOperationsDemo4 {

	public static void main(String[] args) {
	ArrayList list1=new ArrayList();
	list1.add("10");
	list1.add("20");
	list1.add("30");
	list1.add("40");
	list1.add("50");
	list1.add("60");
	System.out.println("Val present in ArrayList list1 is : "+list1);
	System.out.println();
	
	LinkedList list2= new LinkedList();
	list2.add("100");
	list2.add("101");
	list2.add("102");
	list2.add("103");
	list2.add("104");
	list2.add("105");
	
	System.out.println("val present in LinkedList list2 is : "+list2);
	
	System.out.println();
	
	boolean b=list2.containsAll(list1);
	
	System.out.println("Is LinkedList list2 is having list1 :"+b);
	System.out.println();
	
	list2.addAll(list1);
	System.out.println("val present in LinkedList After addind ArrayList list2 is : "+list2);
	
    boolean b1=list2.containsAll(list1);
	
	System.out.println("Is LinkedList list2 is having list1 :"+b1);
	System.out.println();
	/*list2.removeAll(list1);
	
	System.out.println("val present in LinkedList After Deleting ArrayList list2 is : "+list2);
	*/
	list2.retainAll(list1);
	System.out.println("retain The val of list 1 present in list2 : "+list2);
	}

}
