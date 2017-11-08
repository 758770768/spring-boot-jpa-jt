package org.springboot.jpa.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private String eid = "1";
	@Column
	private String ename = "a";
	@Column
	private String bdate = "1992-12-23";
	@Column
	private String sex = "M";
	@Column
	private String city = "古龙";
	@Column
	private String did ;
	
	
	
	

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public Emp(String eid, String ename, String bdate, String sex, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.bdate = bdate;
		this.sex = sex;
		this.city = city;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", bdate=" + bdate + ", sex=" + sex + ", city=" + city + "]";
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
