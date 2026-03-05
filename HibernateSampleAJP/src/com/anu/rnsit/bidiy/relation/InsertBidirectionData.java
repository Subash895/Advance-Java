package com.anu.rnsit.bidiy.relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertBidirectionData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("Hibernate2.cfg.xml")
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
		Session session =factory.getCurrentSession();
		try {
			Student tempStudent=new Student("HariPrasad","thakur","haripara@gmail.com");
			Address tempAddress=new Address("karnataka","goa");
			
			tempStudent.setStdAddress(tempAddress);
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			factory.close();
			session.close();
		}
	}

}
