package com.cluster.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		//creates LinkedHashMap

		// Add key/value to the LinkedHashMap
		// LinkedHashMap stores keys in unordered way
		LinkedHashMap customerMap = new LinkedHashMap();
		customerMap.put("Meheboob", new Double(77.77));
		customerMap.put("Bismilla", new Double(99.99));
		customerMap.put("Vajerma", new Double(12.13));
		customerMap.put("Jannat", new Double(66.66));
		customerMap.put("Biyama", new Double(77.88));
		customerMap.put("Tasmiya", new Double(88.66));
		
		System.out.println(customerMap);
		
		//can Add null
		customerMap.put(null, new Double(88.21));
		customerMap.put(new Integer(12), new Double(33.88));
		customerMap.put("PRAVEEN", "Praveen");
		customerMap.put("Mabusha", new Double(77.77));
		System.out.println(customerMap);
	}

}
