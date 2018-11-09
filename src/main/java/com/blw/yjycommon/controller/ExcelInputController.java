package com.blw.yjycommon.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blw.yjycommon.entity.Business;
import com.blw.yjycommon.entity.Income;
import com.blw.yjycommon.entity.Regist;
import com.blw.yjycommon.entity.Transaction;
import com.blw.yjycommon.model.CashBackExcelModel;
import com.blw.yjycommon.model.Student;
import com.blw.yjycommon.service.ExcelControllerService;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RequestMapping("/ExcelInputController/")
@RestController
//@Api(tags = "Excel导入数据库")
public class ExcelInputController {
	@Autowired
	private ExcelControllerService excelControllerService;
	@PostMapping("test")
	@ApiOperation("测试excel读取")
	public String getExcel(@RequestParam("file") MultipartFile file) {
		List<Student> studentForExcelList=new ArrayList<>();
		ExcelImportResult<Student> result = new ExcelImportResult<>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), Student.class, params);
			studentForExcelList = result.getList();
		} catch (Exception e) {
			 e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		for(Student student:studentForExcelList) {
			System.out.println(student.getName()+"+"+student.getAge());
		}
		return studentForExcelList.toString();
	}
	
	@PostMapping("cashback")
	@ApiOperation("返现管理的导入")
	public Boolean getCashBack(@RequestParam("file") MultipartFile file) {
		List<CashBackExcelModel> cashBackForExcelList=new ArrayList<>();
		ExcelImportResult<CashBackExcelModel> result = new ExcelImportResult<CashBackExcelModel>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), CashBackExcelModel.class, params);
			cashBackForExcelList = result.getList();
		} catch (Exception e) {
			 e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		//删除机器号是空的数据
		Iterator<CashBackExcelModel> it=cashBackForExcelList.iterator();
		while(it.hasNext()) {
			if(StringUtils.isEmpty(it.next().getMathineId())) {
				it.remove();
			}
		}
		excelControllerService.saveFanXian(cashBackForExcelList);
		return true;
	}
	
	@PostMapping("income")
	@ApiOperation("分润管理的导入")
	public Boolean getIncome(@RequestParam("file") MultipartFile file) {
		List<Income> incomeExcelList=new ArrayList<>();
		ExcelImportResult<Income> result = new ExcelImportResult<Income>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), Income.class, params);
			incomeExcelList = result.getList();
		} catch (Exception e) {
			e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		
		excelControllerService.saveIncome(incomeExcelList);
		return true;
	}
	
	@PostMapping("regist")
	@ApiOperation("注册的导入")
	public Boolean getRegistBack(@RequestParam("file") MultipartFile file) {
		List<Regist> registExcelList=new ArrayList<>();
		ExcelImportResult<Regist> result = new ExcelImportResult<Regist>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), Regist.class, params);
			registExcelList = result.getList();
		} catch (Exception e) {
			e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		//删除重复的
		Iterator<Regist> it=registExcelList.iterator();
		while(it.hasNext()) {
			if(StringUtils.isEmpty(it.next().getMachineId())) {
				it.remove();
			}
		}
		excelControllerService.saveRegist(registExcelList);
		return true;
	}
	
	@PostMapping("business")
	@ApiOperation("商户管理的导入")
	public Boolean getBusiness(@RequestParam("file") MultipartFile file) {
		List<Business> businessExcelList=new ArrayList<>();
		ExcelImportResult<Business> result = new ExcelImportResult<Business>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), Business.class, params);
			businessExcelList = result.getList();
		} catch (Exception e) {
			e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		//删除重复的
		Iterator<Business> it=businessExcelList.iterator();
		while(it.hasNext()) {
			if(StringUtils.isEmpty(it.next().getMachineId())) {
				it.remove();
			}
		}
		excelControllerService.saveBusiness(businessExcelList);
		return true;
	}
	
	@PostMapping("Transaction")
	@ApiOperation("交易管理的导入")
	public Boolean getTransaction(@RequestParam("file") MultipartFile file) {
		List<Transaction> transactionForExcelList=new ArrayList<>();
		ExcelImportResult<Transaction> result = new ExcelImportResult<Transaction>();
		ImportParams params = new ImportParams();
		params.setNeedVerfiy(true);
		try {
			result = ExcelImportUtil.importExcelMore(file.getInputStream(), Transaction.class, params);
			transactionForExcelList = result.getList();
		} catch (Exception e) {
			e.getMessage();
		}
		if (result.isVerfiyFail()) {
			result.getFailList().toString();
		}
		
		excelControllerService.saveTransaction(transactionForExcelList);
		return true;
	}
	
	
	
}
