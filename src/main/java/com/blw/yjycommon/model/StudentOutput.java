package com.blw.yjycommon.model;

import java.io.Serializable;

import cn.afterturn.easypoi.excel.annotation.Excel;
//import org.springframework.security.core.userdetails.UserDetails;

public class StudentOutput implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Excel(name = "用户名",width = 40D)
	private String name;
	
	@Excel(name = "年龄",width = 40D )
	private String age;
	
	
	public StudentOutput(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public StudentOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
