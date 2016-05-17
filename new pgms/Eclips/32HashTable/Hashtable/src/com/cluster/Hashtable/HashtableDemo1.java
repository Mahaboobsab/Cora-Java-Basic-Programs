package com.cluster.Hashtable;

import java.util.Hashtable;

public class HashtableDemo1 {

	public static void main(String[] args) {
		
		Hashtable hashtable= new Hashtable();
		
		
		// Add key/value to the Hashtable
		// Hashtable stores keys in unordered way
		hashtable.put("Meheboob", new Double(77.99));
		hashtable.put("Bismilla", new Double(33.33));
		hashtable.put("Jannat", new Double(77.77));
		hashtable.put("Vajerma", new Double(55.33));
		hashtable.put("Rasul", new Double(66.77));
		hashtable.put("Ramzan", new Double(88.99));
		
		System.out.println(hashtable);
		
		// can add different type of key in Hashtable
		
		hashtable.put(new Integer(12), new Double(55.22));
		System.out.println(hashtable);
		
		// can add different type of value in Hashtable
		hashtable.put("Meheboob", "MEHEBOOB");
		System.out.println(hashtable);
		
		// can add duplicate value in Hashtable
	hashtable.put("Sabiya", new Double(88.99));
		
		
		//cannot add null key in hash table
	//	hashtable.put(null, new Double(66.12));
	//	System.out.println(hashtable);
		
		//cannnot add null val in hash table
	//	hashtable.put("Riyaz", null);
		
		System.out.println(hashtable);
		
		
		
		
	}

}
