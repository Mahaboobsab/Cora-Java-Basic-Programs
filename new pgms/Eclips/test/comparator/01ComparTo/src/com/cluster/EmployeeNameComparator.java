package com.cluster;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator
{
	public int compare(Object object1, Object object2)
	{
		if(!((object1 instanceof Employee)&&(object2 instanceof Employee)))
		{
			throw new ClassCastException();
		}
		Employee emp1=(Employee)object1;
		Employee emp2=(Employee)object2;
		String s1=emp1.getName();
		String s2=emp2.getName();
		
		//Compare first object with second object to sort assending order
		//return s1.compareTo(s2);
		
		
		//Compare second object with first object to sort Dssending order
		return s2.compareTo(s1);
	}

}
