package com.cluster1;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(103));
		list.add(new Integer(102));
		list.add(new Integer(100));
		list.add(new Integer(106));
		list.add(new Integer(108));
		list.add(new Integer(105));
		
		System.out.println("ArrayList Befor Sorting : "+list);
		
		Collections.sort(list);
		System.out.println("ArrayList After Sorting : "+list);
		

	}

}
