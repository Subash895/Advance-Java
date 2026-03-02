package com.aun.rnsit;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class ReadStudent {
	public void readStudents() {
		SessionFactory sFactory = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Students.class)
				.buildSessionFactory();
		Session mySession = sFactory.openSession();
		//HQL
		List <Students> students =mySession.createQuery("from student").list();
		for (Students student:students) {
			System.out.println(student);
		}
		// sql 
		//mySession.createsqlquery ("select * from students")
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
