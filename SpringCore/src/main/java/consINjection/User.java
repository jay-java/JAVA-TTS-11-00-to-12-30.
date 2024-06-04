package consINjection;

public class User {
	private int id;
	private String name;
	public User(int id, String name) {
		super();
		System.out.println("by cons");
		this.id = id;
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
