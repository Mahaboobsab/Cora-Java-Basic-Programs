package com.cluster;

import java.util.Collections;
import java.util.LinkedList;

public class SortingStringdemo {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.add("M");
		list.add("E");
		list.add("H");
		list.add("E");
		list.add("B");
		list.add("O");
		list.add("O");
		list.add("B");
		
		//While Sorting LinkedList cannot Compared disssimilor data or null values
		
	/*	list.add(null);
		list.add(new Integer(102));*/
		
		System.out.println("Val of linkedList Befor sorting is "+list);
		
		Collections.sort(list);
		System.out.println("Val of linkedList After sorting is "+list);
		
	}

}
