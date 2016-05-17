package com.cluster;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator{

		
		public int compare(Object objet1, Object object2)
		{
			if(!((objet1 instanceof Employee)&&(object2 instanceof Employee)))
			{
				throw new ClassCastException();
			}
			else
			{
				Employee employee1= (Employee)objet1;
				Employee employee2=(Employee)object2;
				int x=employee1.getEmployeeId();
				int y=employee2.getEmployeeId();
				Integer a=x;
				Integer b=y;
				return 	a.compareTo(b);
			}
		
		}


	}

	


