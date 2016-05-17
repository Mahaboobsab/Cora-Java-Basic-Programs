package com.cluster.Hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableIterationDemo3 {

	public static void main(String[] args) {
		Hashtable hashtable3= new Hashtable();
		hashtable3.put(new Integer(30), "CCC");
		hashtable3.put(new Integer(10), "KKK");
		hashtable3.put(new Integer(20), "BBB");
		hashtable3.put(new Integer(40), "AAA");
		hashtable3.put(new Integer(70), "UUU");
		hashtable3.put(new Integer(60), "DDD");
		
		System.out.println(hashtable3);
		System.out.println();
		
		//Iteration
	Set s =	hashtable3.keySet();
	Iterator itr= s.iterator();
	while(itr.hasNext())
	{
		Integer x =(Integer)itr.next();
		//System.out.println(x);
		
		String s1 =(String)hashtable3.get(x);
		System.out.print(x+"\t"+s1+"\n");
	}
		System.out.println();
		
		
	Collection  c= hashtable3.values();
	Iterator itr1=c.iterator();
	while(itr1.hasNext())
	{
		String name=(String)itr1.next();
		System.out.println("Only Names : "+name);
	}
	
	
	System.out.println("iteration using key and val");
	Set s2=hashtable3.entrySet();
	
	Iterator itr3=s2.iterator();
	while(itr3.hasNext())
	{
		Map.Entry mp =(Map.Entry)itr3.next();
		Integer key=(Integer)mp.getKey();
		String s4=(String)mp.getValue();
		System.out.println("Val and Key : "+key+"\t"+s4);
	}
	
	System.out.println();
	System.out.println("Using enumaraton : ");
	
	
	Enumeration e=hashtable3.keys();
	while(e.hasMoreElements())
	{
		Integer num=(Integer)e.nextElement();
		System.out.println("Keys using enumaration : "+num);
	}
	System.out.println();
	
	System.out.println("Itearation Of Values ");
	
	Enumeration e1=hashtable3.elements();
	while(e1.hasMoreElements())
	{
		String s6=(String)e1.nextElement();
		System.out.println("Using enumaration Names : "+s6);
	}
	
	}

}
