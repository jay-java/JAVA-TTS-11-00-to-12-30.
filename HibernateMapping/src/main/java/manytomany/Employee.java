package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<Project> pro_list;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getPro_list() {
		return pro_list;
	}
	public void setPro_list(List<Project> pro_list) {
		this.pro_list = pro_list;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", pro_list=" + pro_list + "]";
	}
	
}
