package com.cluster.properties;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesIterationDemo3 {

	public static void main(String[] args) {
		Properties properties4 = new Properties();
		properties4.put(new Integer(103), "CCC");
		properties4.put(new Integer(105), "EEE");
		properties4.put(new Integer(102), "BBB");
		properties4.put(new Integer(101), "AAA");
		properties4.put(new Integer(104), "DDD");
		
		System.out.println("Contents in the properties : "+properties4);
		
		Set s =properties4.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer x=(Integer)itr.next();
			//System.out.println(x);
			String s1=(String)properties4.get(x);
			System.out.println("Key is : "+x+"   VAl is : "+s1);
		}
		System.out.println();
		Collection c =properties4.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext())
		{
			String name=(String)itr1.next();
			System.out.println("Only name : "+name);
		}
		
		Set s2=properties4.entrySet();
		Iterator itr3=s2.iterator();
		while(itr3.hasNext())
		{
			Map.Entry mp =(Map.Entry)itr3.next();
			Integer n=(Integer)mp.getKey();
			String name1=mp.getValue().toString();
			System.out.println("Key is : "+n +"  "+"Val is : "+name1);
		}
		
		Enumeration enumeration=properties4.keys();
		while(enumeration.hasMoreElements())
		{
			Integer n1=(Integer)enumeration.nextElement();
			System.out.println("Keys using enumuration : "+n1);
		}
		Enumeration enumeration2=properties4.elements();
		while(enumeration2.hasMoreElements())
		{
			String names=(String)enumeration2.nextElement();
			System.out.println("Only names using enumuration : "+names);
		}
	}

}
