package com.cluster;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet set = new HashSet(); 
		
		System.out.println("size of hashSet befor adding elments : "+set.size());
		System.out.println("Contents adding elments :  "+set);
		System.out.println("Is empty befor adding elments into it : "+set.isEmpty());
		System.out.println();
		
		
		set.add("A");
		set.add("H");
		set.add("Y");
		set.add("D");
		set.add("K");
		set.add("B");
		
		set.add("A");
		set.add(new Integer(10));
		set.add(null);
		
		System.out.println("size of hashSet befor adding elments : "+set.size());
		System.out.println("Contents adding elments :  "+set);
		System.out.println("Is empty befor adding elments into it : "+set.isEmpty());
		
		boolean b=set.contains("B");
		
		System.out.println("It contains B "+b);
		
		boolean b1=set.contains("R");
		
		System.out.println("It contains R "+b1);	
		
		set.remove("H");
		System.out.println("After removimg H : "+set);
		set.clear();
		System.out.println("After clearing All : "+set);
		
		
		/*set.removeAll(set);
		
		System.out.println("After removimg All : "+set);*/
	}

}
