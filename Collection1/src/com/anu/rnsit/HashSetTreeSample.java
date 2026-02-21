package com.anu.rnsit;
import java.util.*;
//import java.util.HashSet;
import java.util.Map.Entry;
//import com.sun.tools.javac.comp.Enter;

public class HashSetTreeSample {

	HashSet <String> HaSet=new HashSet<String>();
	TreeSet <String> TrSet=new TreeSet<String>();
	Scanner scan=new Scanner(System.in);
	public void populateMashSet() {
		HaSet.add("Anudip");
		
		HaSet.add("Bitch");
		HaSet.add("Coalabia");
		HaSet.add("Hubli");
		HaSet.add("Public");
		HaSet.add("Bitchs");
		
//		Employee emp1 = new Employee("Sike", "Sike", 1, 70, 15);
//		HaSet.put("E005", emp1);
//		HaSet.put("E001",new Employee("Sike", "Sike", 1, 70, 15));
//		HaSet.put("E002",new Employee("Sike", "Sike", 2, 70, 15));
//		HaSet.put("E003",new Employee("Sike", "Sike", 3, 70, 15));
//		HaSet.put("E004",new Employee("Sike", "Sike", 4, 70, 15));
	}
	public void fetchMeshSet() {
		Iterator<String> it = HaSet.iterator();

	    while (it.hasNext()) {
	        System.out.println(it.next());
	    }
	}
	public void populateTreeSet() {
		TrSet.add("Anudip");
		TrSet.add("Bitch");
		TrSet.add("Coalabia");
		TrSet.add("Hubli");
		TrSet.add("Public");
		TrSet.add("Bitchs");
//		Employee emp1 = new Employee("Sike", "Sike", 1, 70, 15);
//		TrSet.put("E005", emp1);
//		TrSet.put("E001",new Employee("Sike", "Sike", 1, 70, 15));
//		TrSet.put("E002",new Employee("Sike", "Sike", 2, 70, 15));
//		TrSet.put("E003",new Employee("Sike", "Sike", 3, 70, 15));
//		TrSet.put("E004",new Employee("Sike", "Sike", 4, 70, 15));
	}
	public void fetchTreeSet() {
		Iterator <String> myFetch=TrSet.iterator();
		while(myFetch.hasNext()) {
//			 String value = myFetch.next();
			 System.out.println(myFetch.next());
//			System.out.println("The key is "+myEnter.getKey()+"the Value is "+myEnter.getValue());
//			Entry<String,Employee> myEnter=myEnteryIter.next();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSetTreeSample obj = new HashSetTreeSample();

	    System.out.println("------ HashSet ------");

	    obj.populateMashSet();
	    obj.fetchMeshSet();

	    System.out.println("------ TreeSet ------");

	    obj.populateTreeSet();
	    obj.fetchTreeSet();
	}

}
