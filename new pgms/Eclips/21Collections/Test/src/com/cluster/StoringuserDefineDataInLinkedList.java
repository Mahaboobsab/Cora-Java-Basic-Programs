package com.cluster;

import java.util.ArrayList;

public class StoringuserDefineDataInLinkedList {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		
		Employee employee1=new Employee();
		employee1.setEmployeeId(107);
		employee1.setName("MEHEBOOB");
		employee1.setPhone("8792");
		employee1.setEmail("MRNADAF2010@GMAIL.COM");
		
		Employee employee2=new Employee();
		employee2.setEmployeeId(101);
		employee2.setName("SABIYA");
		employee2.setPhone("8123");
		employee2.setEmail("SABARANI321@GMAIL.COM");
		
		Employee employee3=new Employee();
		employee3.setEmployeeId(102);
		employee3.setName("RAGU");
		employee3.setPhone("888");
		employee3.setEmail("PUTTU.RAGHU@GMAIL.COM");
		
		Employee employee4=new Employee();
		employee4.setEmployeeId(103);
		employee4.setName("BABASAB");
		employee4.setPhone("9686");
		employee4.setEmail("BABASAB@GMAIL.COM");
		
		ArrayList employeeList=new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		System.out.println(employeeList);
		
		System.out.println("End main...GOOD LUCK FOR YOUR FUTURE MEHEBOOB");
		

	}

}
