package com.cluster;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println("Val present in list are : "+list);
		
		ListIterator ltr = list.listIterator();
		
	/*	System.out.print("Val using ListIterator Forward Direction : ");
		while(ltr.hasNext())
		{
			Object e =ltr.next();
			String s=(String)e;
			System.out.print(s+"  ");
		}
			System.out.println();
			
			System.out.print("Contents Of list backward Direction: ");
			while(ltr.hasPrevious())
			{
				Object e1=ltr.previous();
				String s1=(String)e1;
				System.out.print(s1+"   ");
			}*/
			
			
			//modify the Objects being insrted
			
			ListIterator ltr2= list.listIterator();
			while(ltr2.hasNext())
			{
				Object e2=ltr2.next();
				String s2=(String)e2;
				String s3=s2+"X";
				ltr2.set(s3);
				System.out.println(list);
			}
			// now, display the list backwards
			
			System.out.print("Modified list backwards: ");
			while(ltr2.hasPrevious()) {
			      Object element = ltr2.previous();
			      System.out.print(element + " ");
			    }
			    System.out.println();
			    System.out.println(list);
			
			
	}

}
