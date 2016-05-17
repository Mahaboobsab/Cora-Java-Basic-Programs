package com.cluster.treemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo4 {

	public static void main(String[] args) {

		TreeMap map= new TreeMap();
		map.put(new Integer(20), "BBB");
		map.put(new Integer(30), "CCC");
		map.put(new Integer(50), "MMM");
		map.put(new Integer(60), "EEE");
		map.put(new Integer(70), "LLL");
		map.put(new Integer(40), "KKK");
		map.put(new Integer(80), "JJJ");
		map.put(new Integer(90), "XXX");
		
		System.out.println("Val of first key: "+map.firstKey());
		
		System.out.println("val of last key : "+map.lastKey());
		
		//gives key/val from first to 70 excludes 70
		
		SortedMap hm=map.headMap(new Integer(70));
		System.out.println("Val of headmap is excluding 70 : "+hm);
		
		/*TreeMap tm=(TreeMap)map.headMap(new Integer(80));
		System.out.println("Val of headmap is excluding 80 : "+tm);*/
		
		
		// gives key/value from 30  to last and includes 30
		SortedMap tm=map.tailMap(40);
		
		System.out.println("Val from tailMap including 40 : "+tm);
		
		// gives key/value including start range 30 till end range excluding 70
		/*SortedMap sm=map.subMap(new Integer(40), new Integer(70));
		System.out.println("Val b/w 40 to 70 : "+sm);*/
		
	/*Object e=	map.subMap(new Integer(30), new Integer(70));
	System.out.println("Val b/w 30 to 70 : "+e);*/
		
	//Error//NavigableMap nm=map.subMap(new Integer(30), new Integer(70));
		System.out.println();
		
	//System.out.println(map.subMap(new Integer(30), new Integer(80)));	
	
			
	SortedMap sm=map.subMap(new Integer(40), new Integer(70));
	System.out.println("VAl present in sorted map is: "+sm);
	
	}

}
