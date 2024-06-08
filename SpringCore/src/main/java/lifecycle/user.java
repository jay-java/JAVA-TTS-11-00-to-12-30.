package lifecycle;
public class user {
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public user(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void startBean() {
		System.out.println("bean started");
	}
	
	public void endBean() {
		System.out.println("bean destroyed");
	}
	
}
