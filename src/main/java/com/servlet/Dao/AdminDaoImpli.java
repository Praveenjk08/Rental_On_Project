package com.servlet.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.crypto.Data;

import com.servlet.Db.DatabaseConnection;
import com.servlet.Dto.Admin;
import com.servlet.Dto.User;

public class AdminDaoImpli implements AdminDao {
Connection con=null;
PreparedStatement pst=null;
	@Override
	public boolean isAdminRegistered(Admin admin) {
//		User user=new User();
		String adminregister="insert into admins(full_name, email, password, phone_number, created_at) values (?,?,?,?,now())";
		

		con=DatabaseConnection.givemePower();
		try {
			pst=con.prepareStatement(adminregister);
			pst.setString(1, admin.getAdmin_Fullname());
			pst.setString(2, admin.getAdmin_Email());
			pst.setString(3, admin.getAdmin_Password());
			pst.setLong(4,admin.getAdmin_Phone());
//			pst.setInt(5, user.getU_id());
//			pst.setInt(5, user.getU_id());
//			pst.setInt(5, userId);
//			pst.setInt(5, admin.getUser_Id());
			
			int count=pst.executeUpdate();
			if(count>0)
			{
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return false;
	}
	@Override
	public Admin isLogin(String adminEmail, String adminPass) {
		String login="select * from admins where email=? and password=?";
		Admin admin=null;
		con=DatabaseConnection.givemePower();
		try {
			pst=con.prepareStatement(login);
			pst.setString(1, adminEmail);
			pst.setString(2, adminPass);
			ResultSet res=pst.executeQuery();
			if(res.next())
			{
				admin=new Admin();
				admin.setAdmin_id(res.getInt("admin_id"));
				admin.setAdmin_Fullname(res.getString("full_name"));
				admin.setAdmin_Email(res.getString("email"));
				System.out.println("email stored");
				admin.setAdmin_Password(res.getString("password"));
				admin.setAdmin_Phone(res.getLong("phone_number"));
				admin.setCur_date(res.getTimestamp("created_at"));
				
				   
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
 
		return admin;
	}
	
}
