package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	private String address;
	@OneToOne(mappedBy = "pid")
	private Vehicle vid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	
	public Vehicle getVid() {
		return vid;
	}
	public void setVid(Vehicle vid) {
		this.vid = vid;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", vid=" + vid + "]";
	}
	
}
