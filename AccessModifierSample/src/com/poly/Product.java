package com.poly;
import java.util.Scanner;

public class Product {
	int productId;
	private String productsName;
	protected String productDescription;
	String productCatogory;
	public void main(String[] args) {
		Employee Emp1=new Employee();
		String emp;
		Scanner pro1=new Scanner(System.in);
		System.out.println("emter the enployee Phone Number ");
		Emp1.empPhone=pro1.toString();
		
		System.out.println("EmpName"+Emp1.empPhone); 
//		The protected can access if the object is created in the same class 
		
	}
}

