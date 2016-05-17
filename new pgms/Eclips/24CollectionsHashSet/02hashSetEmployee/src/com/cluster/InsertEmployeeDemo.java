package com.cluster;

import java.util.HashSet;
import java.util.Iterator;

public class InsertEmployeeDemo {

	public static void main(String[] args) {
		HashSet set= new HashSet();
		
		
		Employee emp1=new Employee();
		emp1.setEmployeeId(101);
		emp1.setName("MEHEBOOB");
		emp1.setPhone("87922");
		emp1.setEmail("MRNADAF2010@GMAIL.COM");
		
		Employee emp2=new Employee();
		emp2.setEmployeeId(102);
		emp2.setName("SAYYADABAYYA");
		emp2.setPhone("9972");
		emp2.setEmail("SAYYAD@GMAIL.COM");
		
		
		Employee emp3=new Employee();
		emp3.setEmployeeId(103);
		emp3.setName("NABIBAYYA");
		emp3.setPhone("9916");
		emp3.setEmail("NABISAB@GMAIL.COM");
		
		
		Employee emp4=new Employee();
		emp4.setEmployeeId(104);
		emp4.setName("SABIYA");
		emp4.setPhone("420");
		emp4.setEmail("SABARANI321@GMAIL.COM");
		
		HashSet employeeSet = new HashSet();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4); 
		
		
		//Adding duplicates not allowed
		employeeSet.add(emp1);
		
//Why we should override Hash method? because when user enters same data
		//then one more object will get creates so to avoid this we override
		Employee userEmployee=new Employee();
		userEmployee.setEmployeeId(101);
		userEmployee.setName("MEHEBOOB");
		userEmployee.setPhone("87922");
		userEmployee.setEmail("MRNADAF2010@GMAIL.COM");
		
		employeeSet.add(userEmployee);
		
		System.out.println(emp1.hashCode());
		System.out.println(userEmployee.hashCode());
		
		
		System.out.println();
		System.out.println();
		Iterator itr = employeeSet.iterator();
		while (itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print("Employee Id is "+emp.getEmployeeId()+" ");
			System.out.print("name is "+emp.getName()+ " ");
			System.out.print(" phone is "+emp.getPhone()+" ");
			System.out.print("Email is "+emp.getEmail()+"\n");
			
		}
		
	

	}

}
