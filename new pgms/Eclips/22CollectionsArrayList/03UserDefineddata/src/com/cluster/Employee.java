package com.cluster;

public class Employee {
	private int EmployeeId;
	private String name;
	private String Phone;
	private String Email;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String toString() {
		String s = "Employee id is " + EmployeeId + "  " + "Employee Name is  "
				+ name + "  " + "Employee Phone is " + Phone+"Email is "+Email+ " \n";
		return s;
	}

}
