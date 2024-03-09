package core;
class User{
	int id;
	String name;
	double salary;
	User(){
		System.out.println("default cons");
	}
	User(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary=salary;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("id : "+id);
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("name : "+name);
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println("sal : "+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void printData() {
		System.out.println("id : "+id+" name : "+name+" salary : "+salary);
	}
	User(User u4){
		this.id = u4.id;
		this.name = u4.name;
		this.salary = u4.salary;
	}
	
}
public class P009_Constructor {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User(2, "python", 300.0);
		User u5 = new User(u4);
		u5.printData();
		u4.printData();
		u1.setId(1);
		u1.setName("java");
		u1.setSalary(200000);
		u1.printData();
//		System.out.println(u1.getId());
//		System.out.println(u1.getName());
//		System.out.println(u1.getSalary());
	}
}
