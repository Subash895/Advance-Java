package com.rnsit.clas.exe;

public class ArrayIndexExeceptionSample {

		public void manipulateArray()
		{
			int a[] = new int[10];
			System.out.println("Inside the array manipulation method..");
			for(int i=0;i<=10;i++)
			{
				a[i] = (i+1)*100;
				System.out.println("Array element is "+a[i]);
			}
			
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayIndexExeceptionSample ai = new ArrayIndexExeceptionSample();
			try
			{
				ai.manipulateArray();

			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
//				aie.getMessage();
				aie.printStackTrace();
			}
			System.out.println("Completed");
			System.out.println("exit");
		}


}
