package com.anu.rnsit;

public class MethodOverLoadingSample {

	public void Shapes() {
		
	}
	public void calculateSalary(double basic,double hra,double cca) {
		double grossSalary= basic+hra+cca;
		System.out.println("Gross Salary"+grossSalary);
	}
	public void calculateSalary(double basic,double hra,double cca,double deduction ,String empName) {
		double netSalary=(basic+hra+cca)-(deduction);
		double grossSalary=basic+hra+cca;
		System.out.println("the Gross Salary of "+empName+"is"+grossSalary);
		System.out.println("Net Salary for "+empName+"is"+netSalary);
		
	}
	public void calculateSalary(double basic,double hra,double cca,double deduction ,double allowance,String empName) {
		double netSalary=(basic+hra+cca+allowance)-(deduction);
		double grossSalary=basic+hra+cca+allowance;
		System.out.println("the Gross Salary of "+empName+"is"+grossSalary);
		System.out.println("Net Salary for "+empName+"is"+netSalary);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingSample m1=new MethodOverLoadingSample();
		m1.calculateSalary(51, 87, 8, 87, "sike");
		m1.calculateSalary(51, 87, 87);
		m1.calculateSalary(51, 87, 8, 87,922, "sike");
		
		System.out.println();

	}

}
