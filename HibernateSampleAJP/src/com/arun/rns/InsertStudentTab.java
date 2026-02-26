package com.arun.rns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aun.rnsit.Students;

public class InsertStudentTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sFactory = new Configuration().configure("Hibernate1.cfg.xml").addAnnotatedClass(Students.class).buildSessionFactory();

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
