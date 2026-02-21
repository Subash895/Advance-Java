package com.anu.rns;
import java.util.*;
public class ArraySampleOver {
	
	public void arraySam() {
		List<String> Fruit=new ArrayList<String>();
		Fruit.add("Orange");
		Fruit.add("Graps");
		Fruit.add("Tomato");
		
		Iterator myList=Fruit.iterator();
		while(myList.hasNext()) {
			System.out.println(myList.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySampleOver arr=new ArraySampleOver();
		arr.arraySam();
	}

}
