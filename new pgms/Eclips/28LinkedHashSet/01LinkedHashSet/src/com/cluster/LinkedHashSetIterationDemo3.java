package com.cluster;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIterationDemo3 {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();
		set.add(new Integer(100));
		set.add(new Integer(101));
		set.add(new Integer(102));
		set.add(new Integer(103));
		set.add(new Integer(104));
		
		System.out.println("Val stored in linkedhash Set"+set);
		
		//get iterator
		
		System.out.print("Contents of linked List using iterator : ");
		Iterator itr=set.iterator();
		/*while(itr.hasNext())
		{
			Object e=itr.next();
			System.out.print(e+"  ");
		}*/
		
		while(itr.hasNext())
		{
			Object e=itr.next();
			Integer x=(Integer)e;
			System.out.print(x+"  ");
		}
	}

}
