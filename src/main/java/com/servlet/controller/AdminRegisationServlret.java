package com.servlet.controller;

import java.io.IOException;
import java.sql.Timestamp;

import com.servlet.Dao.AdminDao;
import com.servlet.Dao.AdminDaoImpli;
import com.servlet.Dao.UserDao;
import com.servlet.Dao.UserDaoImlimaenation;
import com.servlet.Dto.Admin;
import com.servlet.Dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/adminreg")
public class AdminRegisationServlret extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	AdminDao ado=null;
	UserDao udo=new UserDaoImlimaenation();
	public AdminRegisationServlret() {
		ado=new AdminDaoImpli();
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String adminName=req.getParameter("aname");
	 String adminEmail=req.getParameter("aemail");
	 String adminPassword=req.getParameter("apass");
	 long adminPhone=Long.parseLong(req.getParameter("aph"));
	 
	 
	 
	 
	 Admin admin=new Admin(adminName, adminEmail, adminPassword, adminPhone);
	 
	
	 boolean isAdmin=ado.isAdminRegistered(admin);
	 if(isAdmin==true)
	 {
		 
		 req.getRequestDispatcher("adminlogin.jsp").forward(req, resp);;
		 
	 }
	}
	

}
