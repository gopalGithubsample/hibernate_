package com.example.hibernatestudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Student;
import utilities.SessionFactoryProvider;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Student student1 = new Student("Alice");
            Student student2 = new Student("Bob");

            session.persist(student1);
            session.persist(student2);

            transaction.commit();

            System.out.println("Students saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}