package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	private int vid;
	private String model;
	@OneToOne
	@JoinColumn(name="person_id")
	private Person pid;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Person getPid() {
		return pid;
	}
	public void setPid(Person pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", pid=" + pid + "]";
	}
	
}
