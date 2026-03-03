package com.anu.rnsit.relations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aun.rnsit.Customer;

public class InsertData {
	public void Connection() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("Hibernate2.cfg.xml")
                .addAnnotatedClass(RelAddress.class)
                .addAnnotatedClass(RelStudent.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
        	RelStudent tempStudent= new RelStudent("Subash","BR","subash@gmail.com");
        	RelAddress tempAdress=new RelAddress("karnataka","Bidar");
        	tempStudent.setStudentAddress(tempAdress);
        	session.beginTransaction();
        	session.save(tempStudent);
        	session.getTransaction().commit();
        	
        }catch (Exception e) {
        	e.printStackTrace();
        	session.clear();
        	factory.close();
        }
//        finally {
//        	session.clear();
//        	factory.close();
//        }
	}

}
