package com.anu.rns;
import java.util.*;

public class LinkedListEmployee {

    LinkedList<Employee> employeesLL = new LinkedList<Employee>();

    public void manupulateArray() {
        Employee emp1 = new Employee("Sike", "Sike", null, 1, 70, 15);
        employeesLL.add(emp1);
        employeesLL.add(new Employee("Siked", "Siking", null, 2, 70, 15));
    }
    
    public void getReverseLinkedList() {
    	Iterator <Employee> empDescIter=employeesLL.descendingIterator();
    	while(empDescIter.hasNext()) {
    		Employee c=empDescIter.next();
    		System.out.println(c);	
    	}
    }

    public void getLinkedListData() {

        System.out.println(employeesLL);

 
        for (Employee x : employeesLL) {
            System.out.println(x);
        }

        // Iterator
        Iterator<Employee> empIter = employeesLL.iterator();
        while (empIter.hasNext()) {
            Employee e = empIter.next();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        LinkedListEmployee arr = new LinkedListEmployee();
        arr.manupulateArray();
//        arr.getLinkedListData();
        arr.getReverseLinkedList();
    }
}
