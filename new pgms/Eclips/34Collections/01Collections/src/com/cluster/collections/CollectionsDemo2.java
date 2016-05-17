package com.cluster.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add("C");
		list1.add("A");
		list1.add("B");

		System.out.println("ArrayList Befor Modification : " + list1);

		List list2 = Collections.unmodifiableList(list1);//It allows only read operations
		
		String s=list2.get(1).toString();
		System.out.println(s);
		
	/*	
		list2.add("A");
		list2.remove("Z");
		System.out.println("List 2 contents are : "+list2);
		*/
		//Can Get a Synchronizes List or thread safe List
		
		List list3 = Collections.synchronizedList(list1);
		System.out.println("VAl in list3 Are : "+list3);
		
		
	}

}
