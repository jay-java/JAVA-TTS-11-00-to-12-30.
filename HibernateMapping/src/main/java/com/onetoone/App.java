package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Person;
import model.Vehicle;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p1 = new Person();
		p1.setPid(1);
		p1.setName("java");
		p1.setAddress("ahmedabad");
		
		Person p2 = new Person();
		p2.setPid(2);
		p2.setName("python");
		p2.setAddress("delhi");
		
		
		Vehicle v1 = new Vehicle();
		v1.setVid(1);
		v1.setModel("BMW");
		
		Vehicle v2 = new Vehicle();
		v2.setVid(2);
		v2.setModel("Mercedes");
		
		p1.setVid(v2);
		p2.setVid(v1);
		
		v1.setPid(p2);
		v2.setPid(p1);
		
		session.save(p1);
		session.save(p2);
		session.save(v1);
		session.save(v2);
		
		
		

		tx.commit();
		session.close();
		sf.close();
	}
}
