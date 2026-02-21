package com.anu.rnsit;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Collection;
import java.util.Enumeration;

public class HashTableSample {
	public Hashtable<String,Employee> empTable = new Hashtable<String,Employee>();
	
	public void incertEmp() {
//	public Hashtable<String,Employee> empTable = new Hashtable<String,Employee>();
	Employee emp1 = new Employee("Sike", "Sike", 1, 70, 15);
	empTable.put("E005", emp1);
	empTable.put("E005",new Employee("Sike", "Sike", 9,0, 15));
	empTable.put("E002",new Employee("Sike", "Sike", 2, 70, 15));
	empTable.put("E003",new Employee("Sike", "Sike", 3, 70, 15));
	empTable.put("E004",new Employee("Sike", "Sike", 4, 70, 15));
	
//	for (String key : empTable.keySet()) {
//        System.out.println(key + " -> " + empTable.getOrDefault(key, null));
//    }

	}

	public void fetchHashTableUsingkey() {
		Enumeration <String> empEnum= empTable.keys();
		while(empEnum.hasMoreElements()) {
			String empKey=empEnum.nextElement();
			System.out.println(" the key of the value  "+empKey+"  Is  "+empTable.get(empKey));
		}
	}
	public void fetchMashTableValues() {
		Collection <Employee>myEpCollection=empTable.values();
		Iterator <Employee> myEmpIter=myEpCollection.iterator();
		while(myEmpIter.hasNext()) {
			System.out.println(""+myEmpIter.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableSample obj = new HashTableSample();
		obj.incertEmp();
//        obj.fetchHashTableUsingkey();
        obj.fetchMashTableValues();
        
	}

}
