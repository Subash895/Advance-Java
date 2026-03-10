package com.ajp.model;

public class Employee {
	String empId;
	String empName;
	String empAddress;
	public Employee(String empId, String empName, String empNumber, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNumber = empNumber;
		this.empEmail = empEmail;
	}
	public Employee() {
		super();
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Employee(String empId, String empName, String empAddress, String empNumber, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empNumber = empNumber;
		this.empEmail = empEmail;
	}
	String empNumber;
	String empEmail;
}
