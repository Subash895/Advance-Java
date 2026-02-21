package com.anu.rns;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListSample {
	ArrayList mylist=new ArrayList();
	
	public void manupulateArray() {
		mylist.add(200);
		mylist.add(45);
		mylist.add("hello");
		mylist.add("True");
		
	}
	public void fetchArray() {
		System.out.println(mylist);
		System.out.println("-----------");
		
		for (Object obj:mylist) {
			System.out.println(obj);
		}
		
		System.out.println("----------");
		Iterator mylistIter=mylist.iterator();
		
		while(mylistIter.hasNext()) {
			System.out.println(mylistIter.next());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListSample arr=new ArrayListSample();
		arr.manupulateArray();
		arr.fetchArray();
	}

}
