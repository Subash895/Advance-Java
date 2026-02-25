package com.aun.rnsit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sFactory = new Configuration()
								.configure("Hibernate.cfg.xml")
								.addAnnotatedClass(Students.class)
								.buildSessionFactory();
		
		Session mySession = sFactory.openSession();
		
		try
		{
			mySession.beginTransaction();
			Students student = new Students("Harshith","RTNagar","MCA","harsh@gmail.com");
			mySession.save(student);
			mySession.getTransaction().commit();
			System.out.println("inserted Student record successfully...");
		}
		finally
		{
			mySession.close();
		}

	}

}
