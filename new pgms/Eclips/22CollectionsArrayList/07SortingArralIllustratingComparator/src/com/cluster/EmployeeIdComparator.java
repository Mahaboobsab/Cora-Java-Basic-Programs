package com.cluster;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator {
	public int compare(Object object1, Object object2)
	{
		if(!((object1 instanceof Employee) && (object2 instanceof Employee)))
		{
			throw new ClassCastException();
		}
		else
		{
			Employee emp1=(Employee)object1;
			Employee emp2=(Employee)object2;
			Integer x= emp1.getEmployeeId();
			Integer y=emp2.getEmployeeId();
			
			//For ascending order
			return x.compareTo(y);
			
			//For desscending order
		//	return y.compareTo(x);
		}
	}

}
