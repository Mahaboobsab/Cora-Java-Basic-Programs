package com.cluster.collections;

//Collections class Supports Various Algorithms like Sorting,Shuffing And reversing etc...

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("D");
		list.add("F");
		list.add("E");
		System.out.println("Original ArrayList : "+list);
		
		Collections.sort(list);
		System.out.println("Val in the Array List After Sorting: "+list);
		
		Collections.reverse(list);
		System.out.println("ArrayList After reversing : "+list);
		
		Collections.shuffle(list);
		
		System.out.println("ArrayList After Shuffling : "+list);
		
		System.out.println("Minimum : "+Collections.min(list));
		System.out.println("Maximum : "+Collections.max(list));

	}

}
