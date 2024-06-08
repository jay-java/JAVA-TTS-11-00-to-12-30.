package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("lifecycle/config.xml");
		user u = (user)con.getBean("u1");
		System.out.println(u);
		
		data d1 = (data)con.getBean("d1");
		System.out.println(d1);
		
		Employee e1 = (Employee)con.getBean("e1");
		System.out.println(e1);
		
		con.registerShutdownHook();
		
	}
}
