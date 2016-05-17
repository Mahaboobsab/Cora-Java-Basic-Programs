package com.cluster;

import java.util.Comparator;

public class SortingEmployeeEmailDemo implements Comparator {
	

	public int compare(Object object1, Object object2) {
		
		if(!((object1 instanceof Employee)&&(object2 instanceof Employee)))
		{
			throw new ClassCastException();
		}
		else
		{
			Employee emp1=(Employee)object1;
			Employee emp2=(Employee)object2;
			String s1=emp1.getEmail();
			String s2=emp2.getEmail();
			
			//For Assending order
			return s1.compareTo(s2);
			
			//for Dessending order
			
		//	return s2.compareTo(s1);
		}
	}

}
