package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.Admin;
import com.login.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adr;
	
	public Admin saveadmin(Admin admin) {
		return adr.save(admin);
	}
	public Admin findByAdminemail(String adminemail) {
		return adr.findByAdminemail(adminemail);
	}

}
