package com.spring;


// bean class enitity class pojo(plain java object) class
public class Employee {
	
	// there are two we can set in those variable
	// 1 setter getter method
	// 2 constractor
	private int empid;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	// if you have create parameterized constructor then we should create defalut constructor bcoz JVM will not provide default Constructor
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empid, String fname, String lname, String mobile, String email) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
