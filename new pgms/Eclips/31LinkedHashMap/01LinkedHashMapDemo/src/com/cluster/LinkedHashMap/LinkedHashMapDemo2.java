package com.cluster.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		// Creates Linked HashMap
		LinkedHashMap custHashMap = new LinkedHashMap();
		System.out.println("LinkedHashMap is empty before adding vales: "
				+ custHashMap.isEmpty());
		System.out.println("Size of LinkedHashMap before adding values: "
				+ custHashMap.size());

		// Add key/value to the LinkedHashMap
		custHashMap.put("Kumar", new Double(11.11));
		custHashMap.put("Ravi", new Double(22.22));
		custHashMap.put("Amogh", new Double(33.33));
		custHashMap.put("Vinay", new Double(44.44));
		custHashMap.put("Balaji", new Double(55.55));

		System.out.println("LinkedHashMap is empty after adding values: "
				+ custHashMap.isEmpty());
		System.out.println("Size of LinkedHashMap after adding values: "
				+ custHashMap.size());
		//using same Key will update or replace Val
		custHashMap.put("Ravi", new Double(77.77));
		System.out.println(custHashMap);
		
		
		//Iteration
		
	Set s =custHashMap.keySet();
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		String s1=(String)itr.next();
		System.out.println(s);
	}
	
	
	
	
	}

}
