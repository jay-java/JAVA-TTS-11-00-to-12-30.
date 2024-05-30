package onetomanytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Seller {
	@Id
	private int sid;
	private String name;
	@OneToMany(mappedBy = "sid")
	private List<Product> pid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getPid() {
		return pid;
	}
	public void setPid(List<Product> pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", name=" + name + ", pid=" + pid + "]";
	}
	
}
