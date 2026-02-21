package com.anu.serials;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class EmployeeSerializer {
	ObjectOutputStream ops;
	ArrayList<Employee> als=new ArrayList<>();
	public void serializerEmployee() {
		
		als.add(new Employee("E001","  Sike1" ," Sike01" ,"Sike001" ,555));
		als.add(new Employee("E002","  Sike2" ," Sike02" ,"Sike002" ,555));
		als.add(new Employee("E003","  Sike3" ," Sike03" ,"Sike003" ,555));
		als.add(new Employee("E004","  Sike4" ," Sike04" ,"Sike004" ,555));
		try {
			ops = new ObjectOutputStream(new FileOutputStream("employees.txt"));
			ops.writeObject(als);
			ops.flush();
			ops.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSerializer emp=new EmployeeSerializer();
		emp.serializerEmployee();
		System.out.println("Complete");
	}

}
