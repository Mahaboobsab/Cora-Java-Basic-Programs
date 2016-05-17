package com.cluster;

import java.util.ArrayList;
import java.util.TreeSet;

public class Bulkoperationsdemo1 {

	public static void main(String[] args) {
		//create Arraylist to Store val
		ArrayList list1=new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		
		System.out.println("Values in riginal ArrayList : "+list1);
		
		//Copying data from one ArrayList to ANother Arraylist
		
		ArrayList list2= new ArrayList();
		list2.add("11");
		list2.add("12");
		list2.add("13");
		list2.addAll(list1);
		list2.add("14");
		list2.add("15");
		
		System.out.println();
		
		System.out.println("VAlues in new ArrayList : "+list2);
		
		//copying val from Array Structure to TreeStructure
		TreeSet set = new TreeSet(); 
		set.add("100");
		set.add("105");
		set.addAll(list1);
		set.add("109");
		set.add("107");
		set.add("101");
		System.out.println("Val present in Tree Set : "+set);

	}

}
