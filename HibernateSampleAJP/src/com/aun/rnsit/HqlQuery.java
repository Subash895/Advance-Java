package com.aun.rnsit;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlQuery {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            System.out.println("Customers with address ending with 'nagar'");

            Query<Customer> likeQuery = session.createQuery(
                    "from Customer where customerAddress like '%nagar'",
                    Customer.class);

            List<Customer> likeList = likeQuery.getResultList();
            displayCustomers(likeList);


            System.out.println("Customers with purchaseValue > 15000");

            Query<Customer> greaterQuery = session.createQuery(
                    "from Customer where purchaseValue > 15000",
                    Customer.class);

            List<Customer> greaterList = greaterQuery.getResultList();
            displayCustomers(greaterList);


            System.out.println("Average Purchase Value");

            Double avg = session.createQuery(
                    "select avg(purchaseValue) from Customer",
                    Double.class).getSingleResult();

            System.out.println("Average: " + avg);


            System.out.println("Total Records");

            Long count = session.createQuery(
                    "select count(*) from Customer",
                    Long.class).getSingleResult();

            System.out.println("Count: " + count);

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

    public static void displayCustomers(List<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println("--------------------------------");
    }
}