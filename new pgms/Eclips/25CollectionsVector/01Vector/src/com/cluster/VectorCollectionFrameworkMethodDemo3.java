package com.cluster;

import java.util.Vector;

public class VectorCollectionFrameworkMethodDemo3 {

	public static void main(String[] args) {

		Vector vector = new Vector();
		vector.add("A");
		vector.add("B");
		vector.add("N");
		vector.add("J");
		vector.add(new Integer(100));
		vector.add(null);
		
		System.out.println("Elments present in vector list is : "+vector);
		vector.add(2, "R");
		System.out.println("Elments present in vector 2 R list is : "+vector);
		
		String s=(String)vector.get(3);
		System.out.println(s);
		
		vector.set(3, "786");
		System.out.println(vector);
		
		vector.remove(4);
		System.out.println(vector);
		vector.remove("R");
		System.out.println(vector);
		
		vector.clear();
		System.out.println("Val in vector After clearing "+vector);
		
		
	}

}
