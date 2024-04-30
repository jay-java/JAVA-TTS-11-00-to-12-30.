package model;

public class WishList {
	private int wid,custid,pid;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "WishList [wid=" + wid + ", custid=" + custid + ", pid=" + pid + "]";
	}
	
}
