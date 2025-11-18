package com.servlet.controller;

import java.io.IOException;

import com.servlet.Dao.UserDao;
import com.servlet.Dao.UserDaoImlimaenation;
import com.servlet.Dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserDao udao=null;
	public DeleteServlet() {
		udao=new UserDaoImlimaenation();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empid=Integer.parseInt(req.getParameter("d"));
		boolean isdelete=udao.isDelete(empid);
		if(isdelete==true)
		{
			req.getRequestDispatcher("viewuser").forward(req, resp);;
		}
		
		
	}

}
