package com.blw.yjycommon.ExtractChar;

import java.io.IOException;
import java.util.List;

import com.blw.yjycommon.util.ExtractCharYJY;

public class Sanheyi {
	public static void main(String[] args) throws IOException {
		/**
		 * 把对象中
		 */
		String start = "String ";
		String stop = ";";
		String path = "C:/Users/yjy/Desktop/111111111111111111111/ceshi.txt";
		 List<StringBuilder> list=ExtractCharYJY.getList(start,stop,path);
		for (StringBuilder s : list) {
			System.out.println("Object "+s+"=map.get(\"" + s + "\");");
			System.out.println("if("+s+"!=null){");
			System.out.println("	this." + s + "=(String)map.get(\"" + s + "\");");
			System.out.println("}");
			System.out.println();
		}
		
		/**
		 * 25ge 
		 */
		/*String start = "++";
		String stop = "+";
		String path = "C:/Users/yjy/Desktop/111111111111111111111/25.txt";
		List<StringBuilder> list=ExtractCharYJY.getList(start,stop,path);
		for (StringBuilder s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());*/
	}
	
}
