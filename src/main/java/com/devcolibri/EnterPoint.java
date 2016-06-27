package com.devcolibri;

/**
 * Created by Alenka on 27.06.2016.
 */

import com.devcolibri.entity.User;
import com.devcolibri.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Bill");
        user.setLastName("Gates");

        session.save(user);
        session.getTransaction().commit();
    }

}