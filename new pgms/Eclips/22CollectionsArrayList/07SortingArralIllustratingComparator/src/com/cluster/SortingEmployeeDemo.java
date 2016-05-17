package com.cluster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingEmployeeDemo {

	public static void main(String[] args) {
		ArrayList EmployeeList = new ArrayList();
		
		Employee emp5= new Employee();
		emp5.setEmployeeId(103);
		emp5.setName("ZZZ");
		emp5.setPhone("777");
		emp5.setEmail("ZZZ@GMAIL.COM");
		
		Employee emp1= new Employee();
		emp1.setEmployeeId(100);
		emp1.setName("AAA");
		emp1.setPhone("111");
		emp1.setEmail("AAA@GMAIL.COM");
		
		Employee emp3= new Employee();
		emp3.setEmployeeId(102);
		emp3.setName("BBB");
		emp3.setPhone("222");
		emp3.setEmail("BBB@GMAIL.COM");
		
		Employee emp2= new Employee();
		emp2.setEmployeeId(101);
		emp2.setName("CCC");
		emp2.setPhone("333");
		emp2.setEmail("CCC@GMAIL.COM");
		
		Employee emp4= new Employee();
		emp4.setEmployeeId(105);
		emp4.setName("DDD");
		emp4.setPhone("444");
		emp4.setEmail("DDD@GMAIL.COM");
		
		EmployeeList.add(emp1);
		EmployeeList.add(emp2);
		EmployeeList.add(emp3);
		EmployeeList.add(emp4);
		EmployeeList.add(emp5);
		
		Iterator itr=EmployeeList.iterator();
		
		System.out.println("BEFOR SORTING THE LIST : ");
		System.out.println();
		while(itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print(" EmployeeId is "+emp.getEmployeeId());
			System.out.print(" Employee Name is "+emp.getName());
			System.out.print(" Employee phone is "+emp.getPhone());
			System.out.print(" Emplyee Email is "+emp.getEmail());
			System.out.println();
		}
		System.out.println();

		System.out.println("AfTER SORTING THE LIST BY EMPLOYEE ID: ");
		
		Collections.sort(EmployeeList, new EmployeeIdComparator());
		itr=EmployeeList.iterator();
		while(itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print(" EmployeeId is "+emp.getEmployeeId());
			System.out.print(" Employee Name is "+emp.getName());
			System.out.print(" Employee phone is "+emp.getPhone());
			System.out.print(" Emplyee Email is "+emp.getEmail());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("AfTER SORTING THE LIST BY EMPLOYEE Name: ");
		System.out.println();
		
		Collections.sort(EmployeeList, new EmployeeNameCopmparator());
		
		itr=EmployeeList.iterator();
		while(itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print(" EmployeeId is "+emp.getEmployeeId());
			System.out.print(" Employee Name is "+emp.getName());
			System.out.print(" Employee phone is "+emp.getPhone());
			System.out.print(" Emplyee Email is "+emp.getEmail());
			System.out.println();
		}
		
		System.out.println("AFTER SORTING THE LIST BY EMPLOYEE EMAIL: ");
		System.out.println();
		
		
		Collections.sort(EmployeeList, new SortingEmployeeEmailDemo());
		itr=EmployeeList.iterator();
		while(itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print(" EmployeeId is "+emp.getEmployeeId());
			System.out.print(" Employee Name is "+emp.getName());
			System.out.print(" Employee phone is "+emp.getPhone());
			System.out.print(" Emplyee Email is "+emp.getEmail());
			System.out.println();
			
		}
		
		
	}

}
