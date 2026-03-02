package com.aun.rnsit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertCustomer {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            Customer c1 = new Customer("Rohit", "RTNagar", "9876543210", 12000);
            Customer c2 = new Customer("Anita", "Rajajinagar", "9123456789", 15000);
            Customer c3 = new Customer("Kiran", "Jayanagar", "9988776655", 18000);

            session.save(c1);
            session.save(c2);
            session.save(c3);

            session.getTransaction().commit();

            System.out.println("Customers inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}