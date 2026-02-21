package com.anu.rnsit;

public class ParserUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parse myParser;
		myParser =new XmlParser();
		myParser.parse("Bitch");
		
		XmlParser xml=new XmlParser();
		xml.displayParser();
		xml.parse("bitch");
		

	}

}
