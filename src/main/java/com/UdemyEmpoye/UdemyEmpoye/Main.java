package com.UdemyEmpoye.UdemyEmpoye;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            session.save(new Employee("Patryk", "Chojnacki", "Hal-Bud"));

        } finally {
            session.close();
        }

    }
}
