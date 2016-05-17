package com.cluster;
import java.util.Comparator;


public class MyComparator implements Comparator
{
	 public int compare(Object obj1, Object obj2) 
	 {
		    String a = (String) obj1;
		    String b = (String) obj2;

		    // reverse the comparison
		    // compare the second object with the first object for descending order
		    return b.compareTo(a);
	  }
}
