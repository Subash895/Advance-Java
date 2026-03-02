package com.aun.rnsit;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlQuery {

    public void readCust() {

        SessionFactory sFactory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = sFactory.getCurrentSession();

        try {

            session.beginTransaction();

            System.out.println("Records with address ending with nagar:");
            List<Customer> customers1 = session
                    .createQuery("from Customer where customerAddress like '%nagar'", Customer.class)
                    .getResultList();
            displayCustomers(customers1);

            System.out.println("Records with address ending with nagar and purchaseValue > 1000:");
            List<Customer> customers2 = session
                    .createQuery("from Customer where purchaseValue > 1000 and customerAddress like '%nagar'", Customer.class)
                    .getResultList();
            displayCustomers(customers2);

            System.out.println("Records with address ending with nagar OR purchaseValue > 10000:");
            List<Customer> customers3 = session
                    .createQuery("from Customer where customerAddress like '%nagar' or purchaseValue > 10000", Customer.class)
                    .getResultList();
            displayCustomers(customers3);

            System.out.println("----- AGGREGATE FUNCTIONS -----");

            Double avg = session.createQuery(
                    "select avg(purchaseValue) from Customer", Double.class)
                    .getSingleResult();
            System.out.println("Average: " + avg);

            Integer max = session.createQuery(
                    "select max(purchaseValue) from Customer", Integer.class)
                    .getSingleResult();
            System.out.println("Max: " + max);

            Integer min = session.createQuery(
                    "select min(purchaseValue) from Customer", Integer.class)
                    .getSingleResult();
            System.out.println("Min: " + min);

            // --------- FETCH SPECIFIC COLUMNS USING SQL ---------

            System.out.println("----- Specific Columns using Native SQL -----");

            Query queryArObj = session.createNativeQuery(
                    "select custName, custPhone, custAddress, purchaseValue from Customers");

            List<Object[]> data = queryArObj.getResultList();

            for (Object[] row : data) {
                System.out.println(
                        "CustomerName: " + row[0] +" | CustomerPhone: " + row[1] +" | CustomerAddress: " + row[2] +" | PurchaseValue: " + row[3]
                );
            }

            session.getTransaction().commit();

        } finally {
            sFactory.close();
        }
    }

    public static void displayCustomers(List<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        new HqlQuery().readCust();
    }
}