package com.cluster;

import java.util.LinkedList;

public class StoringUserdefinedDataInLinkedListDemo {

	public static void main(String[] args) {
		
	
	
	
	Employee employee2=new Employee();
	employee2.setEmployeeId(100);
	employee2.setName("SABIYA");
	employee2.setPhone("420");
	employee2.setEmail("SABARANI321@GMAIL.COM");
	
	Employee employee1=new Employee();
	employee1.setEmployeeId(105);
	employee1.setName("MEHEBOOB");
	employee1.setPhone("777");
	employee1.setEmail("MRNADAF2010@GMAIL.COM");
	
	Employee employee3 = new Employee();
	employee3.setEmployeeId(101);
	employee3.setName("RAGHU");
	employee3.setPhone("555");
	employee3.setEmail("PUTTU.RAGHU@GMAIL.COM");
	
	Employee employee4=new Employee();
	employee4.setEmployeeId(102);
	employee4.setName("BABASAB");
	employee4.setPhone("999");
	employee4.setEmail("BABASAB@GMAIL.COM");
	
	LinkedList employeeList = new LinkedList();
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	employeeList.add(employee4);
	
	System.out.println(employeeList);
	

	}

}
