package com.servlet.Dao;

import com.servlet.Dto.Admin;

public interface AdminDao {
	public boolean isAdminRegistered(Admin admin);
	public Admin isLogin(String adminEmail,String adminPass);
	

}
