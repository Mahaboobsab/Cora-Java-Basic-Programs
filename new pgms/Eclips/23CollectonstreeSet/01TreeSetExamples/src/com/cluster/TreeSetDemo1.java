package com.cluster;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(40));
		set.add(new Integer(50));
		set.add(new Integer(60));
		set.add(new Integer(70));
		set.add(new Integer(80));
		
		System.out.println("Elments present in the tree set is : "+set);
		
		System.out.print("using Iterator : ");
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Object e=itr.next();
			Integer x=(Integer)e;
			System.out.print(x+"  ");
		}
		

	}

}
