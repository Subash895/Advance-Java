package com.anu.rns;
import java.util.*;

public class ArrayListEmployee {
	ArrayList <Employee> employees=new ArrayList<Employee>();
	public void manupulateArray() {
		Employee emp1=new Employee("Sike", "Sike", null, 1, 70, 15);
		employees.add(emp1);
		employees.add(new Employee("Siked", "Siking", null, 2, 70, 15));
		employees.add(new Employee("Siked", "Siking","hi", 3, 70, 15));
		employees.add(new Employee("Siked", "Siking", null, 4, 70, 15));
	}
	public void getArrayListData() {
		
//		System.out.println(employees);
//		for (Employee x:employees) {
//			System.out.println(x);
//		}
//		
//		Iterator <Employee>empIter=employees.iterator();
//		while(empIter.hasNext()) {
////			Employee e=(Employee)empIter.next();
//			Employee e=empIter.next();
//			System.out.println(e);
//		}
		System.out.println("Employees "+employees.get(0));
		System.out.println("Employees Removed"+employees.removeFirst());
//		System.out.println("Employees "+employees.get(1));
		
		Iterator <Employee>empIter=employees.iterator();
		while(empIter.hasNext()) {
//			Employee e=(Employee)empIter.next();
			Employee e=empIter.next();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListEmployee arr= new ArrayListEmployee();
		arr.manupulateArray();
		arr.getArrayListData();
	}
	

}
