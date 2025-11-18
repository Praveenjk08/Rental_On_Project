package com.servlet.controller;

import java.io.IOException;
import java.util.List;

import com.servlet.Dao.UserDao;
import com.servlet.Dao.UserDaoImlimaenation;
import com.servlet.Dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/viewuser")
public class viewUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	UserDao udao=null;
	public viewUserServlet() {
		udao=new UserDaoImlimaenation();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> userlist=udao.getUserDetails();
		System.out.println("Data is coming");
		if(userlist!=null)
		{
			req.setAttribute("userlist1", userlist);
//			resp.sendRedirect("userdetails.jsp?user"+userlist);
			
			req.getRequestDispatcher("userdetails.jsp").forward(req, resp);
		}
	}

}
