package collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private Set<String> address;
	private List<Long> contact;
	private Map<Integer, String> data;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name, Set<String> address, List<Long> contact, Map<Integer, String> data) {
		super();
		System.out.println("data set by constructor");
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.data = data;
	}

	public Map<Integer, String> getData() {
		return data;
	}
	public void setData(Map<Integer, String> data) {
		System.out.println("map set by setter injection");
		this.data = data;
	}
	public void setAddress(Set<String> address) {
		System.out.println("set set by setter injection");
		this.address = address;
	}
	public void setContact(List<Long> contact) {
		System.out.println("list set by setter injection");
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id set by setter injection");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name set by setter injection");
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", data=" + data
				+ "]";
	}
	
}
