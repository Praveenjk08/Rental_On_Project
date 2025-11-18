package com.servlet.Dto;

import java.sql.Timestamp;

public class Admin {
	private int admin_id;
	private String admin_Fullname;
	private String admin_Email;
	private String admin_Password;
	private long admin_Phone;
	private Timestamp cur_date;
//	private int user_Id;
	public Admin() {
		
	}
	
	
	
	public Admin(String admin_Fullname, String admin_Email, String admin_Password, long admin_Phone) {
	super();
	this.admin_Fullname = admin_Fullname;
	this.admin_Email = admin_Email;
	this.admin_Password = admin_Password;
	this.admin_Phone = admin_Phone;
}



	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_Fullname() {
		return admin_Fullname;
	}
	public void setAdmin_Fullname(String admin_Fullname) {
		this.admin_Fullname = admin_Fullname;
	}
	public String getAdmin_Email() {
		return admin_Email;
	}
	public void setAdmin_Email(String admin_Email) {
		this.admin_Email = admin_Email;
	}
	public String getAdmin_Password() {
		return admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		this.admin_Password = admin_Password;
	}
	public long getAdmin_Phone() {
		return admin_Phone;
	}
	public void setAdmin_Phone(long admin_Phone) {
		this.admin_Phone = admin_Phone;
	}
	public Timestamp getCur_date() {
		return cur_date;
	}
	public void setCur_date(Timestamp cur_date) {
		this.cur_date = cur_date;
	}
//	public int getUser_Id() {
//		return user_Id;
//	}
//	public void setUser_Id(int user_Id) {
//		this.user_Id = user_Id;
//	}
	
	
	
	
	
	
	

}
