package com.cluster;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortingEmployeeDemo {

	public static void main(String[] args) {
		
	Employee employee1=new Employee();
	employee1.setEmployeeId(101);
	employee1.setName("MAHABOOBSAB");
	employee1.setPhone("8792");
	employee1.setEmail("MRNADAF2010@GMAIL.COM");
	
	Employee employee2 = new Employee();
	employee2.setEmployeeId(105);
	employee2.setName("SABIYA");
	employee2.setPhone("8123");
	employee2.setEmail("SABARANI321@GMAIL.COM");
	
	Employee employee3=new Employee();
	employee3.setEmployeeId(103);
	employee3.setName("HIMESH");
	employee3.setPhone("9686");
	employee3.setEmail("HIMESH@GMAIL.COM");
	
	Employee employee4 = new Employee();
	employee4.setEmployeeId(102);
	employee4.setName("RAGHAVENDRA");
	employee4.setPhone("8888");
	employee4.setEmail("PUTTU.RAGHU@GMAIL.COM");
	
	LinkedList employeeList=new LinkedList<>();
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	employeeList.add(employee4);
	
	//System.out.println("Employee list is "+employeeList);
	
	System.out.println("LIST OF EMPLOYEE BEFORR SORTING");
	
	Iterator itr=employeeList.iterator();
	
	while(itr.hasNext())
	{
		Object e=itr.next();
		Employee emp=(Employee)e;
		System.out.print("Employee Id Is  "+emp.getEmployeeId()+" ");
		System.out.print("Employee Name is "+emp.getName()+" ");
		System.out.print("EMployee Phone Is"+emp.getPhone()+" ");
		System.out.print("Employee Email Is "+emp.getEmail()+"\n");
	}
	System.out.println();
	
	System.out.println("LIST OF EMPLOYEE After SORTING By ID");
	Collections.sort(employeeList,new EmployeeIdComparator());
	// set the iterator to the beginning
			itr = employeeList.iterator();
			while(itr.hasNext())
			{
				Object e = itr.next();
				Employee emp = (Employee)e;
				System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
				System.out.print("Name is " + emp.getName() + " ");
				System.out.print("Phone is " + emp.getPhone() + " ");
				System.out.print("Email is " + emp.getEmail() + "\n");
				
			}
			System.out.println();
			
	System.out.println("LIST OF EMPLOYEE After SORTING By Name");
	
	Collections.sort(employeeList,new EmployeeNameComparator());
	
	itr = employeeList.iterator();
	while(itr.hasNext())
	{
		Object e = itr.next();
		Employee emp = (Employee)e;
		System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
		System.out.print("Name is " + emp.getName() + " ");
		System.out.print("Phone is " + emp.getPhone() + " ");
		System.out.print("Email is " + emp.getEmail() + "\n");
		
	}
	
	
	}

}
