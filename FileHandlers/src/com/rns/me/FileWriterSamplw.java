package com.rns.me;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileWriterSamplw {
	
	FileWriter fwriter;
	String str="Hi the will be writing in to the file ";
	public void writeToCharStream() { //  Or Use throws IOException;
		try {
			fwriter=new FileWriter("customer1.txt");
			fwriter.write(str);
			fwriter.flush();
			fwriter.close();
			
			System.out.println("Hi bitchs");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriterSamplw file=new FileWriterSamplw();
		file.writeToCharStream();
		
	}

}
