package com.servlet.controller;

import java.io.IOException;

import com.servlet.Dao.AdminDao;
import com.servlet.Dao.AdminDaoImpli;
import com.servlet.Dto.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminlog")
public class AdminLoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AdminDao ado=null;
	public AdminLoginServlet() {
		ado=new AdminDaoImpli();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String adminEamil=req.getParameter("aname");
	String adminPassword=req.getParameter("apass");
	
	Admin admin=ado.isLogin(adminEamil, adminPassword);
	if(admin!=null)
	{
		HttpSession session=req.getSession();
		session.setAttribute("admin", admin);
		req.getRequestDispatcher("admindash.jsp").forward(req, resp);
		
//		resp.sendRedirect("admindash.jsp");
		
		}
	
			
	}
	
	
	

}
