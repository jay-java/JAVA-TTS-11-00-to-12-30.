package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void startBean() {
		System.out.println("bean started by annotation");
	}
	
	@PreDestroy
	public void endBean() {
		System.out.println("bean destroyed by annotation");
	}
	
}
