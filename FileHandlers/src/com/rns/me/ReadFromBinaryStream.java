package com.rns.me;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromBinaryStream {
	
	byte myBytes[] = new byte[100];
	FileInputStream fis;
	
	public void readFromBinaryStream()
	{
		try {
			fis = new FileInputStream("supplier.txt");
			fis.read(myBytes);
			String readStr = new String(myBytes);
			System.out.print("The Data read from file:"+readStr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFromBinaryStream r = new ReadFromBinaryStream();
		r.readFromBinaryStream();
	}

}