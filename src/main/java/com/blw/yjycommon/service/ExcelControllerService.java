package com.blw.yjycommon.service;

import java.util.List;

import com.blw.yjycommon.entity.Business;
import com.blw.yjycommon.entity.Income;
import com.blw.yjycommon.entity.Regist;
import com.blw.yjycommon.entity.Transaction;
import com.blw.yjycommon.model.CashBackExcelModel;

public interface ExcelControllerService {

	void saveFanXian(List<CashBackExcelModel> cashBackForExcelList);

	void saveIncome(List<Income> incomeList);

	void saveRegist(List<Regist> registExcelList);

	void saveTransaction(List<Transaction> transactionForExcelList);

	void saveBusiness(List<Business> businessExcelList);

}
