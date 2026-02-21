package com.anu.rnsit;
import java.util.*;

public class MashMapSample {
	HashMap <String,Employee> empMap= new HashMap <String,Employee>();
	public void populateHashMap() {
		Employee emp1 = new Employee("Sike", "Sike", 1, 70, 15);
		empMap.put("E005", emp1);
		empMap.put("E001",new Employee("Sike", "Sike", 1, 70, 15));
		empMap.put("E002",new Employee("Sike", "Sike", 2, 70, 15));
		empMap.put("E003",new Employee("Sike", "Sike", 3, 70, 15));
		empMap.put("E004",new Employee("Sike", "Sike", 4, 70, 15));
		
	}
	
	public void fetchHashMapThrowKey() {
		Set <String> myKeySet=empMap.keySet();
		Iterator <String> myKeyIter=myKeySet.iterator();
		while(myKeyIter.hasNext()) {
			String myKey=myKeyIter.next();
			System.out.println("The value for the key "+myKey+" is "+empMap.get(myKey));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MashMapSample mashMap=new MashMapSample();
		mashMap.populateHashMap();
		mashMap.fetchHashMapThrowKey();
	}

}
