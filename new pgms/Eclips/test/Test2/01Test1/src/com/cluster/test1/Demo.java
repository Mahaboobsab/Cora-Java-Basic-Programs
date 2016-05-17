package com.cluster.test1;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		/*set.add("Ravi");
		set.add("Amar");*/

		set.add(new Integer(10));
		set.add(new Integer(20));
		System.out.println("The val in set is : " + set);
	}

}
