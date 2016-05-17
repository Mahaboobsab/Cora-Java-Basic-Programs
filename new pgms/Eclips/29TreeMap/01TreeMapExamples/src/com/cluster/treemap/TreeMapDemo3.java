package com.cluster.treemap;

import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {
		
		TreeMap CustomerMap= new TreeMap();
		
		System.out.println("Size of the tree map Befor Adding elments : "+CustomerMap.size());
		System.out.println("Contents of TreeMap Befor Adding Elments Are : "+CustomerMap);
		System.out.println("Is TreeMap is empty Befor Adding Elments : "+CustomerMap.isEmpty());
		System.out.println();
		
		CustomerMap.put("Meheboob", new Double(11.11));
		CustomerMap.put("Nabibayya", new Double(22.22));
		CustomerMap.put("Sayyadbayya", new Double(33.33));
		CustomerMap.put("Jannat", new Double(44.44));
		CustomerMap.put("Bismilla", new Double(55.55));
		
		System.out.println("Size of the tree map Befor Adding elments : "+CustomerMap.size());
		System.out.println("Contents of TreeMap Befor Adding Elments Are : "+CustomerMap);
		System.out.println("Is TreeMap is empty Befor Adding Elments : "+CustomerMap.isEmpty());
		
		//Using Same Key update or repalece val
		
		CustomerMap.put("Meheboob", "77.77");
		System.out.println("Contents Updatting Meheboob Elment Are : "+CustomerMap);
		
		//can Add different type of valin treemap
		CustomerMap.put("Biyama", "JAITUN");
		System.out.println("Contents Adding Different Elments Are : "+CustomerMap);
		
		//Can put null Val in TreeMap
		CustomerMap.put("Hello", null);
		
		// cannot add null key in TreeMap
	//	CustomerMap.put(null, null); Errror
		
		//Cannot Add different type of VAl tree Map
		//CustomerMap.put(new Integer(10), new Integer(20));
		System.out.println("Contents Adding null Elments Are : "+CustomerMap);
		System.out.println();
		
		//Getting val using key
		Object e=CustomerMap.get("Meheboob");
		System.out.println("VAl of Meheboob is "+e);
		
		Object e2=CustomerMap.get("Sabiya");
		System.out.println("Val of saviya is :"+e2);
		System.out.println();
		
	boolean b1=	CustomerMap.containsKey("Meheboob");
	boolean b2=CustomerMap.containsKey("Sabiya");
	System.out.println("Meheboob Contains Key : "+b1);
	System.out.println("Sabiya Contains Key : "+b2);
		//deleting
	
	System.out.println(CustomerMap.containsValue("77.77"));
	System.out.println(CustomerMap.containsValue(new Double(77.77)));
	System.out.println(CustomerMap.containsValue("77.79"));
	
	CustomerMap.remove("Meheboob");
	System.out.println("Contents After removing Meheboob : "+CustomerMap);
		CustomerMap.clear();
	System.out.println("Contents After Clearing : "+CustomerMap);
		
		
		
	}

}
