package com.harish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();        // create a Java object
        a1.setAid(101);                // fill it with data
        a1.setAname("Navin");
        a1.setTech("Java");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");  // read DB credentials
        config.addAnnotatedClass(Alien.class);  // tell hibernate which class maps to which table

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(a1);   // convert Java object → SQL INSERT and run it
        tx.commit();           // confirm/save the changes

    }
}
