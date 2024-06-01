package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf  =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	List<User> list = null;
	public void insertUser(User u) {
		session.save(u);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("data inserted");
	}
	
//	public User GetUserById(int id) {
//		User u = session.get(User.class, id);	
//		return u;
//	}
//	
//	public void updateUser(User u) {
//		session.update(u);
	
//	}
//	
//	public void deleteUser(int id) {
//		User u = session.get(User.class, id);
//		session.delete(u);
//	}
//	
//	public User loginUser(User u) {
//		Query q = session.createQuery("from User u where u.email=:email and u.password=:password");
//		q.setParameter("email", u.getEmail());
//		q.setParameter("password", u.getPassword());
//		list = q.list();
//		User u1 = list.get(0);
//		return u1;
//	}
	
	
	
}
