package com.aun.rnsit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCustomer {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int idToDelete = 1;

            Customer customer = session.get(Customer.class, idToDelete);

            if (customer != null) {
                session.delete(customer);
                System.out.println("Customer deleted with id: " + idToDelete);
            } else {
                System.out.println("Customer not found");
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}