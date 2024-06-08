package consAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("consAmbiguity/config.xml");
		Data d = (Data)con.getBean("d1");
		System.out.println(d);
	}
}
