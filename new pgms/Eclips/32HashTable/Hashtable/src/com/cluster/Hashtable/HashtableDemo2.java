package com.cluster.Hashtable;

import java.util.Hashtable;

public class HashtableDemo2 {

	public static void main(String[] args) {
		Hashtable hashtable1= new Hashtable();
		
		System.out.println("Hashtable is empty before adding vales: "+ hashtable1.isEmpty() );
		System.out.println("Size of Hashtable before adding values: "+ hashtable1.size() );
		
		
		hashtable1.put("Meheboob", new Double(77.99));
		hashtable1.put("Bismilla", new Double(33.33));
		hashtable1.put("Jannat", new Double(77.77));
		hashtable1.put("Vajerma", new Double(55.33));
		hashtable1.put("Rasul", new Double(66.77));
		hashtable1.put("Ramzan", new Double(88.99));
		System.out.println(hashtable1);
		
		System.out.println("Hashtable is empty before adding vales: "+ hashtable1.isEmpty() );
		System.out.println("Size of Hashtable before adding values: "+ hashtable1.size() );
		
		// using same key will update or replace the value 
		
		hashtable1.put("Meheboob", new Double(77.78));
		System.out.println(hashtable1);
		
		//Getting val using key
		Object e =hashtable1.get("Meheboob");
		System.out.println("Val of Meheboob is : "+e);
		
	Object e2=	hashtable1.get("Tom");
	System.out.println("Val of tom is : "+e2);
	
	hashtable1.remove("Meheboob");
	System.out.println("After removing Meheboob : "+hashtable1);
	
	boolean b=hashtable1.containsKey("Ramzan");//1.2 method
	boolean b1=hashtable1.contains("Haramkor");//1.0 method
	System.out.println("present Ramzan "+b);
	System.out.println("Present Haramkor "+b1);
	
	System.out.println(hashtable1.contains("77.77"));
	System.out.println(hashtable1.contains(new Double(77.77)));
	hashtable1.clear();
	System.out.println("After clearing HashTable: "+hashtable1);
	}

}
