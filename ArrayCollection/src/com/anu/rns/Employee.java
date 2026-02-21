package com.anu.rns;

public class Employee {
	String empCode;
	String empName;
	String empAdress;
	int empId;
	double empSalary;
	double empTax;
	public Employee(String empCode, String empName, String empAdress, int empId, double empSalary, double empTax) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empAdress = empAdress;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empTax = empTax;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public double getEmpTax() {
		return empTax;
	}
	public void setEmpTax(double empTax) {
		this.empTax = empTax;
	}
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", empAdress=" + empAdress + ", empId=" + empId
				+ ", empSalary=" + empSalary + ", empTax=" + empTax + "]";
	}

}
