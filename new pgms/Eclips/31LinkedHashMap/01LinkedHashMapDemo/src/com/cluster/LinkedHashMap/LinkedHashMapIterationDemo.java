package com.cluster.LinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapIterationDemo {

	public static void main(String[] args) {
		LinkedHashMap map1= new LinkedHashMap();
		map1.put(new Integer(102), "CCC");
		map1.put(new Integer(100), "DDD");
		map1.put(new Integer(101), "LLL");
		map1.put(new Integer(104), "MMM");
		map1.put(new Integer(106), "OOO");
		map1.put(new Integer(107), "III");
		System.out.println(map1);
		
		//iteration
		
		Set s=map1.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer x=(Integer)itr.next();
			//System.out.println(x);
			System.out.print(x+"  "+map1.get(x)+" \n");
		}
		Collection c =map1.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext())
		{
			Object o=itr1.next();
			System.out.println(o);
		}
		
		Set s1=map1.entrySet();
		Iterator itr2=s1.iterator();
		while(itr2.hasNext())
		{
			Map.Entry mp=(Map.Entry)itr2.next();
			Integer k=(Integer)mp.getKey();
			String s3=mp.getValue().toString();
			System.out.print(k+"\t"+s3+"\n");
		}
	}

}
