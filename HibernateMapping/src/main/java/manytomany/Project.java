package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany
	private List<Employee> emp_list;
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
	public List<Employee> getEmp_list() {
		return emp_list;
	}
	public void setEmp_list(List<Employee> emp_list) {
		this.emp_list = emp_list;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emp_list=" + emp_list + "]";
	}
	
}
