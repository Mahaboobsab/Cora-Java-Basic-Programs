package com.cluster1;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringDemo {

	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("A");
	list.add("H");
	list.add("C");
	list.add("G");
	list.add("B");
	list.add("D");
	list.add("E");
	
	System.out.println("Befor sorting Array list: "+list);
	
	Collections.sort(list);
	System.out.println("Befor sorting After list: "+list);
	
	
	

	}

}
