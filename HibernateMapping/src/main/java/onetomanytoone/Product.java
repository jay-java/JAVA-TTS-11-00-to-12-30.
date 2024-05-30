package onetomanytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	@ManyToOne
	@JoinColumn(name ="seller_id")
	private Seller sid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Seller getSid() {
		return sid;
	}
	public void setSid(Seller sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", sid=" + sid + "]";
	}
	
}
