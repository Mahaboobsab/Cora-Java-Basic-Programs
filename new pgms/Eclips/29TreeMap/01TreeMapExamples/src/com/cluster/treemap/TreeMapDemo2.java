package com.cluster.treemap;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		
		// create TreeMap
		//Add key/val to customerMap
		//treemap Stors in sorted order
		
		
		TreeMap CustomerMap= new TreeMap();
		CustomerMap.put("Meheboob", new Double(11.11));
		CustomerMap.put("Nabibayya", new Double(22.22));
		CustomerMap.put("Sayyadbayya", new Double(33.33));
		CustomerMap.put("Jannat", new Double(44.44));
		CustomerMap.put("Bismilla", new Double(55.55));
		
		
		System.out.println(CustomerMap);
		
		
		
	}

}
