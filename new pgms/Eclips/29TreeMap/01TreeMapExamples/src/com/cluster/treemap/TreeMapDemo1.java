package com.cluster.treemap;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// create TreeMap
		
		TreeMap map= new TreeMap();
		//Add key/val to the treeMap
		//TreeMap Store key in sorted order
		
		map.put(new Integer(103), "EEE");
		map.put( new Integer(101), "AAA");
		map.put(new Integer(100), "BBB");
		map.put(new Integer(106), "DDD");
		map.put(new Integer(104), "CCC");
		
		System.out.println(map);

	}

}
