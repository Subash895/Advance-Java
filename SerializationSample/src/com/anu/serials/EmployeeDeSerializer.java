package com.anu.serials;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EmployeeDeSerializer {
	ObjectInputStream ols;
	ArrayList<Employee> adls=new ArrayList<>();
	public void deSerializeEmployee(){
	try{
	ols=new ObjectInputStream(new FileInputStream("employees.txt");
	adls=(ArrayList<Employee>)ols.readObject();
	System.out.println("deserailier object are");
		for (Employee edls){
		}
	}catch(Exception e){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EmployeeDeSerializer deS=new EmployeeDeSerializer();
	deS.deSerializeEmployee();
	}

}
