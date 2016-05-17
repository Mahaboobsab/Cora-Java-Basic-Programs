package com.cluster;

public class Employee {
	private int EmployeeId;
	private String name;
	private String phone;
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
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String toString() {
		String s = "EmpId Is " + EmployeeId + " " + "Emp Name is " + " " + name
				+ " " + "phone is " + phone + " " + "Email Is " + Email + "\n";
		return s;
	}

}
