package com.rns.me;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderSample {
	FileReader freader;
	String str;
	int ch;

	public void readFromCharStream() {
		try {
			freader =new FileReader("D:\\ENGINEERING\\8th-Sem\\Project\\Advance-Java\\FileHandlers\\customer1.txt");
			
			while ((ch = freader.read()) != -1) {
			    System.out.print((char) ch);
			}

			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReaderSample Fread=new FileReaderSample();
		Fread.readFromCharStream();
	}

}
