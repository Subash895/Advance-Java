package com.rns.me;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class WriteToBinaryStream {
	byte myBytes[]=new byte[100];
	String str=" we are writing to binry stream";
	FileOutputStream fos;
	public void writeToBinaryStrea() {
		myBytes=str.getBytes();
		try {
			fos = new FileOutputStream("supplier.txt");
			fos.write(myBytes);
			fos.flush();
			fos.close();
			System.out.println("written into binary Stream Succesfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		WriteToBinaryStream Binary=new WriteToBinaryStream();
		Binary.writeToBinaryStrea();	
	}
}
