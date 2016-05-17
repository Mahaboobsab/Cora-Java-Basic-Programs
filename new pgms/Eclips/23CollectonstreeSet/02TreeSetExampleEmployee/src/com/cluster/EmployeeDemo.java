package com.cluster;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmployeeid(101);
		emp1.setName("AAA");
		emp1.setPhone("111");
		emp1.setEmail("AAA@GMAIL.COM");
		
		Employee emp2 = new Employee();
		emp2.setEmployeeid(102);
		emp2.setName("BBB");
		emp2.setPhone("222");
		emp2.setEmail("BBB@GMAIL.COM");
		
		Employee emp3 = new Employee();
		emp3.setEmployeeid(103);
		emp3.setName("CCC");
		emp3.setPhone("333");
		emp3.setEmail("CCC@GMAIL.COM");
		
		Employee emp4 = new Employee();
		emp4.setEmployeeid(104);
		emp4.setName("DDD");
		emp4.setPhone("444");
		emp4.setEmail("DDD@GMAIL.COM");
		
		Employee emp5 = new Employee();
		emp5.setEmployeeid(105);
		emp5.setName("EEE");
		emp5.setPhone("555");
		emp5.setEmail("EEE@GMAIL.COM");
		
		TreeSet set = new TreeSet();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Object e=itr.next();
			Employee emp=(Employee)e;
			System.out.print("Employee Id is "+emp.getEmployeeid()+"  ");
			System.out.print("Employee Name is "+emp.getName()+" ");
			System.out.print("Employee Phone is "+emp.getPhone()+" ");
			System.out.print("EMployee Email Is "+emp.getEmail()+"\n");
			
		}
	}

}
