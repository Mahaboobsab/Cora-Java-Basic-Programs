package com.cluster;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIterationDemo {

	public static void main(String[] args) {

		TreeMap map= new  TreeMap();
		map.put(new Integer(105), "AAA");
		map.put(new Integer(101), "GGG");
		map.put(new Integer(103), "BBB");
		map.put(new Integer(102), "III");
		map.put(new Integer(104), "KKK");
		map.put(new Integer(100), "LLL");
		map.put(new Integer(106), "MMM");
		
	//	System.out.println(map);
		
		//Iterator using key
		Set s=map.keySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer k=(Integer)itr.next();
			//System.out.println(k);
			
			//UsingKey we can get val
			String v=(String)map.get(k);
			System.out.println(k+"\t"+v+"\n");
		}
		
		//iterate using values
		
		Collection c =map.values();
		
		Iterator itr1=c.iterator();
		while(itr1.hasNext())
		{
			String name=(String)itr1.next();
			System.out.println(name);
		}
		
		
		System.out.println();
		System.out.println();
		
		// iterate using both key and value
		Set s1=map.entrySet();
		Iterator itr2=s1.iterator();
		while(itr2.hasNext())
		{
			Map.Entry me =(Map.Entry)itr2.next();
			Integer q=(Integer)me.getKey();
			String f=me.getValue().toString();
			System.out.println(q+"\t"+f+" \n");
		}
		
		
		
	}

}
