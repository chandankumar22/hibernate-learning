package com.ck.dev;

import com.ck.dev.entities.UsersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class DriverClass {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);

        //creating the user in db table
        UsersEntity usersEntity = new UsersEntity("1245as23", "eynujdGgvjhUYY*&hs", new Date(System.currentTimeMillis()), 22);
        System.out.println(usersEntity);

        updateInTable(factory,usersEntity);

    }

    public static void updateInTable(SessionFactory factory,UsersEntity usersEntity){
        //open the session
        Session currentSession = factory.openSession();
        //initiate the transaction
        Transaction transaction = currentSession.beginTransaction();
        //save the object to the table
        currentSession.save(usersEntity);
        //commit the transaction
        transaction.commit();
        //close the session
        currentSession.close();
    }
}
