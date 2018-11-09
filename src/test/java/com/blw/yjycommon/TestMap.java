package com.blw.yjycommon;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;


public class TestMap {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>();
		Map<String,Object> map1=new HashMap<>();
		map1.put("1",new A("a1","1") );
		map.put("map1", map1);
		Map<String,Object> map2=new HashMap<>();
		map2.put("1",new A("a2","b2") );
		map.put("map2", map2);
		//System.out.println(JSON.toJSONString(map));
	}
	
}

class A{
	private String a;
	private String b;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	
}
