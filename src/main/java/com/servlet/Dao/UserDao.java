package com.servlet.Dao;

import java.util.List;

import com.servlet.Dto.User;

public interface UserDao {
	public boolean isRegisterd(User user); 
	public User isLogin(String email,String pass);
	public List<User> getUserDetails();
	public boolean isDelete(int uid);

}
