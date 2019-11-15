package cn.jlk.VO;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Admin implements Serializable{
	private String aid;
	private String password;
	private Date lastdate;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastdate() {
		return lastdate;
	}
	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	

}
