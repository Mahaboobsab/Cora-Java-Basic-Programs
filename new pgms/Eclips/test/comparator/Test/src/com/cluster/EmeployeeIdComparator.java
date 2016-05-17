package com.cluster;

import java.util.Comparator;

public class EmeployeeIdComparator implements Comparator
{
	
	public int compare(Object object1, Object object2) 
	{
		if(!((object1 instanceof Employee)&&(object2 instanceof Employee)))
				{
					throw new ClassCastException();
				}
		else
		{
			Employee emp1=(Employee)object1;
			Employee emp2= (Employee)object2;
			int a=emp1.getEmployeeId();
			int b=emp2.getEmployeeId();
			Integer x=a;
			Integer y=b;
			//For sorting in assending order
			return x.compareTo(y);
			
			//For deseending
			//return y.compareTo(x);
		}
	
	}

}
