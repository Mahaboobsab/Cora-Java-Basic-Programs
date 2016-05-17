package com.cluster;

import java.util.Comparator;

public class MyComparator implements Comparator
{
	
	public int compare (Object object1, Object object2)
	{
		if(!((object1 instanceof Employee)&&(object2 instanceof Employee)))
		{
			throw new ClassCastException();
		}
		else
		{
			Employee emp1=(Employee)object1;
			Employee emp2= (Employee)object2;
			int a =emp1.getEmployeeid();
			int b =emp2.getEmployeeid();
			
			Integer x=a;
			Integer y=b;
			return y.compareTo(x);
		}
	}

}
