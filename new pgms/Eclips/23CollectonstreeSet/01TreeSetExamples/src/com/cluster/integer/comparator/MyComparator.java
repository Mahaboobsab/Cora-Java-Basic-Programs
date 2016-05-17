package com.cluster.integer.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare (Object object1 ,Object object2)
	{
		Integer x = (Integer)object1;
		Integer y=(Integer)object2;
		return y.compareTo(x);
	}

}
