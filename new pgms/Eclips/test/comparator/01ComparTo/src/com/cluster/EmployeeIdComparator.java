package com.cluster;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator {
	public int compare(Object object1,Object object2 )
	{
		if(!(object1 instanceof Employee  )&&(object2 instanceof Employee))
		{
			throw new ClassCastException();
		}
		
		else
		{
			Employee emp1=(Employee)object1;
			Employee emp2=(Employee)object2;
			
			int a=emp1.getEmployeeId();
			int b=emp2.getEmployeeId();
			Integer x=a;
			Integer y=b;
		
			//comparing first object with second object in Ascedding order
			return x.compareTo(y);
			
			//comparing second object with first object in descending order
		 //  return y.compareTo(x);
			
		}
	}

}

