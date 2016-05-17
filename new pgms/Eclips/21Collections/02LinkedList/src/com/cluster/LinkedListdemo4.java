package com.cluster;

import java.util.LinkedList;

public class LinkedListdemo4 {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		
		System.out.println("Contents of all: "+list);
		
		Object a[]=list.toArray();
		
		for (int i = 0; i < a.length; i++)
		{
			Object e=a[i];
			
			//System.out.println("int val is "+a[i]);//new Class
			Integer x=(Integer)e;
			System.out.println("int val is "+x);
			
		}
	}

}
