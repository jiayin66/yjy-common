package com.blw.yjycommon.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 根据pdm文档自动生成实体代码和model代码
 * 金鹏
 * @author yjy
 *
 */
public class AutoCodingBySQL {
	public static void main(String[] args) throws IOException {
		//拿大写变量列
		List<StringBuilder> list1=ExtractCharYJY.getList(null,null,null);
		//拿中文列
		List<StringBuilder> list3=ExtractCharYJY.getList(null,null,null);
		//拿类型列
		List<StringBuilder> listforType=ExtractCharYJY.getList(null,null,null);
		
		
		
		
		//转为驼峰变量列
			List<String> list2=getVariable(list1);
		List<String> list4=changeChar(listforType);
		
		
		
		/**
		 * 实体
		 * @ApiModelProperty(value = "管辖区域")
			@Column(name = "glxq")
			private String glxq;
		 */
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("@ApiModelProperty((value = \"" + list3.get(i) + "\")");
			System.out.println("@Column(name = \"" + list1.get(i) + "\")");
			System.out.println("private " + list4.get(i) + " " + list2.get(i) + ";");
		}
		
		/**
		 * 普通模型
		 */
		/*for (int i = 0; i < list1.size(); i++) {
			System.out.println("@ApiModelProperty((value = \"" + list3.get(i) + "\")");
			System.out.println("private " + list4.get(i) + " " + list2.get(i) + ";");
		}*/
	}

	/**
	 * 根据数据库的字段映射类型
	 * VARCHAR2----String
	 * DATE----Date
	 * NUMBER----BigDecimal
	 * INTEGER----Integer
	 * @param listforType
	 * @return
	 */
	private static List<String> changeChar(List<StringBuilder> listforType) {
		List<String> list=new ArrayList<String>();
		for(StringBuilder stringBuilder:listforType) {
			String type=new String(stringBuilder);
			if(type.startsWith("VARCHAR2")) {
				list.add("String");
			}else if(type.startsWith("DATE")) {
				list.add("Date");
			}else if(type.startsWith("NUMBER")) {
				list.add("BigDecimal");
			}else if(type.startsWith("INTEGER")) {
				list.add("Integer");
			}else {
				list.add("String");
			}
		}
		return list;
	}

	/**
	 * 把全大写的转为驼峰的小写
	 * @param list1
	 * @return
	 */
	private static List<String> getVariable(List<StringBuilder> list1) {
		List<String> list2=new ArrayList<String>();
		for(StringBuilder stringBuilder:list1) {
			String str=new String(stringBuilder);
			str=str.toLowerCase();
			String[] split = str.split("_");
			String strResult=split[0];
			for(int i=0;i<split.length;i++) {
				String start=split[i].substring(0, 1).toUpperCase();
				String end=split[i].substring(1);
				strResult+=start+end;
			}
			list2.add(strResult);
		}
		return list2;
	}
	
}

class commonModel{
	//string date bigdecimal 
	private String type;
	
	private String remark;
	
	private String colum;
	
	private String variable;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getColum() {
		return colum;
	}

	public void setColum(String colum) {
		this.colum = colum;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	
	
}