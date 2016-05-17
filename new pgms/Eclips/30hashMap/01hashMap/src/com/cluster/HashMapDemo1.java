package com.cluster;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// Create HashMAp
		HashMap customerMap= new HashMap();

		// Add key/value to the HashMap
		// HashMap stores keys in unordered way
		
		customerMap.put("Meheboob", new Double(11.22));
		customerMap.put("Sabiya", new Double(33.22));
		customerMap.put("Raghu", new Double(66.33));
		customerMap.put("Nabi", new Double(13.82));
		customerMap.put("Sayyad", new Double(25.52));
		customerMap.put("Bismilla", new Double(56.22));
		
		System.out.println(customerMap);
		
		//can Add null val in hashMap
		customerMap.put(null, new Double(15.15));
		System.out.println(customerMap);
		
		//can Add different type of keys in HashMap
		customerMap.put(new Integer(10), new Double(72.22));
		
		System.out.println(customerMap);
		
		//can Add different type of val in hashMap
		customerMap.put("Praveen", "PRAVEEN");
		System.out.println(customerMap);
		
		//CAN add null val in HashMap
		customerMap.put("Hello", "null");
		System.out.println(customerMap);
		//can Add duplicate Val in Hash map
		customerMap.put("Sunil", new Double(66.33));
		System.out.println(customerMap);
	}

}
