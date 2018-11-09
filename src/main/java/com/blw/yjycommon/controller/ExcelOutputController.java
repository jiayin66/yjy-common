package com.blw.yjycommon.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blw.yjycommon.model.StudentOutput;
import com.blw.yjycommon.util.FileUtil;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import io.swagger.annotations.Api;

@RequestMapping("/ExcelOutputController/")
@RestController
//@Api(tags = "Excel导出数据库")
public class ExcelOutputController {
	@PostMapping("ceshi")
	public String getExcel(HttpServletResponse response) {
		List<StudentOutput> list=new ArrayList<StudentOutput>();
		list.add(new StudentOutput("张三","29"));
		list.add(new StudentOutput("李四","27"));
		
		//导出
		FileUtil.exportExcel(list,"1","1",StudentOutput.class,"ces.xls",response);
    
	/*	
		
		ExportParams params=new ExportParams("交易明细","1");
		Workbook wb=ExcelExportUtil.exportExcel(params, StudentOutput.class,list);
		response.setHeader("Content-Disposition", "attachment;filename=" +dateStr+".xls");
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
      */

		return "1";
	}
}
