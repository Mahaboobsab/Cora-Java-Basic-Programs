package com.cluster;

import java.util.ArrayList;

public class EmployeeDemoUsingArrayList {

	public static void main(String[] args) {
		Employee emp1= new  Employee();
		emp1.setEmployeeId(1);
		emp1.setName("AAA");
		emp1.setPhone("111");
		emp1.setEmail("AAA@gmail.com");
		
		Employee emp2= new  Employee();
		emp2.setEmployeeId(2);
		emp2.setName("BBB");
		emp2.setPhone("222");
		emp2.setEmail("BBB@gmail.com");
		
		Employee emp3= new  Employee();
		emp3.setEmployeeId(3);
		emp3.setName("CCC");
		emp3.setPhone("333");
		emp3.setEmail("CCC@gmail.com");
		
		Employee emp4= new  Employee();
		emp4.setEmployeeId(4);
		emp4.setName("DDD");
		emp4.setPhone("444");
		emp4.setEmail("DDD@gmail.com");
		
		ArrayList EmployeeList = new ArrayList();
		EmployeeList.add(emp1);
		EmployeeList.add(emp2);
		EmployeeList.add(emp3);
		EmployeeList.add(emp4);
		
		System.out.println("Val present in EmployeeList : ");
		System.out.println(EmployeeList);
		
		
		
		
		
	}

}
