package com.cluster;

import java.util.Collections;
import java.util.LinkedList;

public class SortingIntegerDemo {

	public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add(new Integer(102));
	list.add(new Integer(103));
	list.add(new Integer(107));
	list.add(new Integer(104));
	
	System.out.println("VAl in linkedList Befor Sort "+list);
	
	Collections.sort(list);
	System.out.println("VAl in linkedList After Sort "+list);
	
	}

}
