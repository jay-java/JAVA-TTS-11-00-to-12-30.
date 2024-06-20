package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Seller s = new Seller();
		s.setId(1);
		s.setName("abc");

		Seller s1 = new Seller();
		s1.setId(2);
		s1.setName("xyz");
		
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("mobile");

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("laptop");
		
		
		s.setProduct(p2);
		s1.setProduct(p1);
		
		p1.setSeller(s1);
		p2.setSeller(s);
		
		session.save(s);
		session.save(s1);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
