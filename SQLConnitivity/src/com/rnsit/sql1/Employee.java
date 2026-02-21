package com.rnsit.sql1;

public class Employee {
	String empId;
	String empName;
	String empAdd;
	int empSal;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
	}
	public Employee(String empId, String empName, String empAdd, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empSal = empSal;
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
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
}
