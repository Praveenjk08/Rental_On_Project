package com.servlet.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import com.servlet.Dao.UserDao;
import com.servlet.Dao.UserDaoImlimaenation;
import com.servlet.Dto.Admin;
import com.servlet.Dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegisationnServlet extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	UserDao udao=null;
	public UserRegisationnServlet() {
		udao=new UserDaoImlimaenation();
		System.out.println("object created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
	     String password=req.getParameter("pass");
		long phone=Long.parseLong(req.getParameter("ph"));
		
		
//		LocalDateTime curDateTime=LocalDateTime.parse(req.getParameter("date"));
		User user=new User(name, email, password, phone);
		boolean isRegiseter=udao.isRegisterd(user);
		
		if(isRegiseter==true)
		{
			Admin admin=new Admin();
//			admin.setUser_Id(isRegiseter);
			
			req.getRequestDispatcher("login.jsp")
			.forward(req, resp);
		}
		
	}
	
	

}
