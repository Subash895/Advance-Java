package com.arun.rns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aun.rnsit.Students;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sFactory = new Configuration().configure("Hibernate1.cfg.xml").addAnnotatedClass(StudentsTab.class).buildSessionFactory();

		Session mySession = sFactory.openSession();

		try
		{
			mySession.beginTransaction();
			StudentsTab student1 = mySession.get(StudentsTab.class, 1);
			student1.setStdEmail("kiran@gmail.com");
			student1.setStdCourse("MTech");
			mySession.getTransaction().commit();
			System.out.println("bitch");

		}
		
		finally
		{ 
			mySession.close();
		}
		
		

	}

}