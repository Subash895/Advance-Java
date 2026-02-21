package com.anu.serials;
import java.io.Serializable;

public class Employee implements Serializable{
	String empId;
	String empName;
	String empAddress;
	String empPhone;
	int empNumber;
	
	
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
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empPhone="
				+ empPhone + ", empNumber=" + empNumber + "]";
	}
	public Employee(String empId, String empName, String empAddress, String empPhone, int empNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPhone = empPhone;
		this.empNumber = empNumber;
	}
	
}
