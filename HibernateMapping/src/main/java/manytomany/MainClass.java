package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("java");
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("python");
		
		
		Project p1 = new Project();
		p1.setPid(1);
		p1.setPname("e-commerce");
		
		Project p2 = new Project();
		p2.setPid(2);
		p2.setPname("HRMS");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		
		
		List<Project> proList = new ArrayList<Project>();
		proList.add(p1);
		proList.add(p2);
		e1.setPro_list(proList);
		e2.setPro_list(proList);
		
		p1.setEmp_list(empList);
		p2.setEmp_list(empList);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
