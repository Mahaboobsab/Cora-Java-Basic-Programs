package com.cluster;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		System.out.println("inttial seze of the tree setbefor addind elments "+set.size());
		System.out.println("Contents of the tree set befor adding elments "+set);
		System.out.println("TreeSet is empty befor dding elments "+set.isEmpty());
		
		System.out.println();
		
		set.add("B");
		set.add("T");
		set.add("A");
		set.add("C");
		set.add("H");
		set.add("I");
		set.add("a");
		
		System.out.println("inttial seze of the tree setbefor addind elments "+set.size());
		System.out.println("Contents of the tree set befor adding elments "+set);
		System.out.println("TreeSet is empty befor dding elments "+set.isEmpty());
		
		//set.add("B");
		//set.add(new Integer(10));
		//set.add(null);
		
		System.out.println("inttial seze of the tree setbefor addind elments "+set.size());
		System.out.println("Contents of the tree set befor adding elments "+set);
		System.out.println("TreeSet is empty befor dding elments "+set.isEmpty());

		boolean b= set.contains("B");
		
		System.out.println("Val of B is is present "+b);
		
		boolean b1=set.contains("Z");
		
		System.out.println("Val of Z is is present "+b1);
		
		set.remove("T");
		
		System.out.println("Contents of the tree set After removing T adding elments "+set);
		
		System.out.println("Size of TreeSet after deletion: " + set.size());
		
		set.clear();
		
		System.out.println("inttial seze of the tree setbefor addind elments "+set.size());
		System.out.println("Contents of the tree set befor adding elments "+set);
		System.out.println("TreeSet is empty befor dding elments "+set.isEmpty());
		
		
		

	}

}
