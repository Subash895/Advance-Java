package com.anu.rnsit;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapSample {
	TreeMap <String,Employee>empTMap=new TreeMap <String,Employee>();
	public void populateTreeMap() {
		Employee emp1 = new Employee("Sike", "Sike", 1, 70, 15);
		empTMap.put("E005", emp1);
		empTMap.put("E001",new Employee("Sike", "Sike", 1, 70, 15));
		empTMap.put("E002",new Employee("Sike", "Sike", 2, 70, 15));
		empTMap.put("E003",new Employee("Sike", "Sike", 3, 70, 15));
		empTMap.put("E004",new Employee("Sike", "Sike", 4, 70, 15));
	}
	public void fetchTreemapThrruEntrySet() {
		

		Set <Entry<String,Employee>>myEnterSet=empTMap.entrySet();
		Iterator <Entry<String,Employee>> myEnteryIter=myEnterSet.iterator();
		while(myEnteryIter.hasNext()) {
			
			Entry<String,Employee> myEnter=myEnteryIter.next();
			
			System.out.println("The key is "+myEnter.getKey()+"the Value is "+myEnter.getValue());
		}
//	    for (Map.Entry<String, Employee> entry : empTMap.entrySet()) {
//	        System.out.println(entry.getKey() + " -> " + entry.getValue());
//	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapSample obj = new TreeMapSample();

	    obj.populateTreeMap();
	    obj.fetchTreemapThrruEntrySet();
	}

}
