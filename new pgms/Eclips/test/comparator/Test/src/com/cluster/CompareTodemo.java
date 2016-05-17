package com.cluster;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CompareTodemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		Employee emp1=new Employee();
		emp1.setEmployeeId(100);
		emp1.setName("MAHABOOBSAB");
		emp1.setPhone("87922");
		emp1.setEmail("MAHABOOBSAB@GMAIL.COM");
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(101);
		emp2.setName("SABIYA");
		emp2.setPhone("8123");
		emp2.setEmail("SABARANI321@GMAIL.COM");
		
		Employee emp3 = new Employee();
		emp3.setEmployeeId(103);
		emp3.setName("BABASAB");
		emp3.setPhone("9686");
		emp3.setEmail("BABASAB@GMAIL.COM");
		
		Employee emp4 =new Employee();
		emp4.setEmployeeId(102);
		emp4.setName("RAGHU");
		emp4.setPhone("7777");
		emp4.setEmail("RAGHU@GMAIL.COM");
		
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	
	
	System.out.println("EMPLOYEE TABLE BEFOR SORTING");
	System.out.println();
	Iterator itr = list.iterator();
	
	while(itr.hasNext())
	{
		Object e=itr.next();
		Employee emp=(Employee)e;
		System.out.print("Employee Id is "+emp.getEmployeeId()+"  ");
		System.out.print("Employee Name is "+emp.getName()+" ");
		System.out.print("Employee Phone is "+emp.getPhone()+" ");
		System.out.print("Email is " +emp.getEmail()+"\n");
	}
	System.out.println();
	
	
	Collections.sort(list,new EmeployeeIdComparator());
	System.out.println("EMPLOYEE TABLE After SORTING BY ID SORTING");
     itr = list.iterator();
	
	while(itr.hasNext())
	{
		Object e=itr.next();
		Employee emp=(Employee)e;
		System.out.print("Employee Id is "+emp.getEmployeeId()+"  ");
		System.out.print("Employee Name is "+emp.getName()+" ");
		System.out.print("Employee Phone is "+emp.getPhone()+" ");
		System.out.print("Email is " +emp.getEmail()+"\n");
	}
	System.out.println();
		}

}
