package com.cluster;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Integer(10));
		set.add(new Integer(12));
		set.add(new Integer(11));
		set.add(new Integer(13));
		set.add(new Integer(14));
		set.add(new Integer(16));
		set.add(new Integer(15));
		
		System.out.println("Val in HashSet befor Iterating : "+set);
		
		System.out.println();
		System.out.print("Val in HAsh Set After Iterating  : ");
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Object e = itr.next();
			Integer x= (Integer)e;
			System.out.print(x+" ");
		}
	}

}
