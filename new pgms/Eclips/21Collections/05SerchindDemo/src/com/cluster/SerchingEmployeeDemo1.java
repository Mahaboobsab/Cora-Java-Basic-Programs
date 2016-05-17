package com.cluster;

import java.util.LinkedList;

public class SerchingEmployeeDemo1 {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setEmployeeId(101);
		employee1.setName("MEHEBOOB");
		employee1.setPhone("8792");
		employee1.setEmail("MRNADAF2010@GMAIL.COM");
		
		Employee employee2=new Employee();
		employee2.setEmployeeId(105);
		employee2.setName("SABIYA");
		employee2.setPhone("8123");
		employee2.setEmail("SABARANI@GMAIL.COM");
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(100);
		employee3.setName("BABASAB");
		employee3.setPhone("9999");
		employee3.setEmail("BABASAB@gmail.com");
		
		Employee employee4=new Employee();
		employee4.setEmployeeId(102);
		employee4.setName("RAGHU");
		employee4.setPhone("7878");
		employee4.setEmail("RAGHU@GMAIL.COM");
		
		
		// add all employees into LinkedList
		LinkedList employeeList = new LinkedList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
	
		// search an employee
		
		Employee UseEmployee = new Employee();
		UseEmployee.setEmployeeId(201);
		UseEmployee.setPhone("VASANT");
		UseEmployee.setPhone("4200");
		UseEmployee.setEmail("VASAVT@GMAIL.COM");
		
		if(employeeList.contains(UseEmployee))
		{
			System.out.println("UseEmployee list Present ");
		}
		else
		{
			System.out.println("UseEmployee list is not Present ");
		}

	}

}
