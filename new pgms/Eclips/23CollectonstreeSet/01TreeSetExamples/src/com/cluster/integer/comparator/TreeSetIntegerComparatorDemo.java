package com.cluster.integer.comparator;

import java.util.TreeSet;

public class TreeSetIntegerComparatorDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Integer(22));
		set.add(new Integer(55));
		set.add(new Integer(77));
		set.add(new Integer(11));
		set.add(new Integer(87));
		set.add(new Integer(96));
		set.add(new Integer(7));
		set.add(new Integer(6));
		
		System.out.println("Val in treeset in natural order : "+set);
		
		TreeSet set2 = new TreeSet(new MyComparator());
		
		set2.add(new Integer(22));
		set2.add(new Integer(55));
		set2.add(new Integer(77));
		set2.add(new Integer(11));
		set2.add(new Integer(87));
		set2.add(new Integer(96));
		set2.add(new Integer(7));
		set2.add(new Integer(6));
		
		System.out.println("Val in treeset in in descending order order : "+set2);

	}

}
