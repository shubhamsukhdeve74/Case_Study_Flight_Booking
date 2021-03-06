package com.login.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admin")
public class Admin {
	
	@Id
	private String adminid;
	private String adminemail;
	private Integer password;
	public  String getAdminid() {
		return adminid;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminemail=" + adminemail + ", password=" + password + "]";
	}
	public Admin(String adminid, String adminemail, Integer password) {
		super();
		this.adminid = adminid;
		this.adminemail = adminemail;
		this.password = password;
	}
	
	public Admin() {
	
	}	

}
