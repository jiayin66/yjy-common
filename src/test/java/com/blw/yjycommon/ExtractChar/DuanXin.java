package com.blw.yjycommon.ExtractChar;

import java.io.IOException;
import java.util.List;

import com.blw.yjycommon.util.ExtractCharYJY;

public class DuanXin {
	
	
	public static void main(String[] args) throws IOException {
		String start = ",\r\n" + 
				"   ";
		String stop = " ";
		String path = "C:/Users/yjy/Desktop/111111111111111111111/duanxin.txt";
		List<StringBuilder> list=ExtractCharYJY.getList(start,stop,path);
		for (StringBuilder s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
		
		for (StringBuilder s : list) {
			System.out.println("@Column(name=\""+s+"\")");
			System.out.println("@ApiModelProperty(value = \"案件\")");
			String ss=(s+"").toLowerCase();
		/*	if(ss.contains("_")) {
				String last=ss;
				x:{
					
					int a=ss.indexOf("_");
					String property1=ss.substring(0,a).toLowerCase();
					String property2=ss.substring(a+1,a+2).toUpperCase();
					String property3=ss.substring(a+2).toLowerCase();
					last=property1+property2+property3;
					if(last.contains("_")) {
						break x;
					}
				}
				System.out.println("private String "+last+";");
				
			}else {
				System.out.println("private String "+ss+";");
				
				
			}*/	
			
			System.out.println("private String "+ss+";");
			System.out.println();
		}
		
		
		
	}
	
	
	
	
}
