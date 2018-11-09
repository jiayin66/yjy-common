package com.blw.yjycommon.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Student {
	@Excel(name = "用户名", orderNum = "0")
	//@Excel(name = "生日（年-月-日 时:分:秒）", orderNum = "14",importFormat="yyyy-MM-dd HH:mm:ss",exportFormat="yyyy-MM-dd HH:mm:ss")
	private String name;
	@Excel(name = "年龄", orderNum = "1")
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}