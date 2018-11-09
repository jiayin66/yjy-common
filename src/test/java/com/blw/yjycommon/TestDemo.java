package com.blw.yjycommon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

public class TestDemo {
	public static void main(String[] args) throws ParseException {
		List<String> list=new ArrayList<>();
		list.add("1");
		
		if(!CollectionUtils.isEmpty(list)) {
			if(StringUtils.isNotEmpty(list.get(0))){
					System.out.println("此cjdbh：{}已经阅读过不再给中心发消息,直接返回");
					return;
				}
		}
		System.out.println("111");
	}
}
