package com.blw.yjycommon.service.imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blw.yjycommon.dao.BusinessDao;
import com.blw.yjycommon.dao.CashBackDao;
import com.blw.yjycommon.dao.IncomeDao;
import com.blw.yjycommon.dao.RegistDao;
import com.blw.yjycommon.dao.TransactionDao;
import com.blw.yjycommon.entity.Business;
import com.blw.yjycommon.entity.CashBackEntity;
import com.blw.yjycommon.entity.Income;
import com.blw.yjycommon.entity.Regist;
import com.blw.yjycommon.entity.Transaction;
import com.blw.yjycommon.model.CashBackExcelModel;
import com.blw.yjycommon.service.ExcelControllerService;

@Service
public class ExcelControllerServiceImp implements ExcelControllerService {
	@Autowired
	private CashBackDao cashBackDao;
	@Autowired
	private IncomeDao incomeDao;
	@Autowired
	private RegistDao registDao;
	@Autowired
	private BusinessDao businessDao;
	@Autowired
	private TransactionDao transactionDao;

	/**
	 * 插入数据库，去除重复数据，去除数据库已有数据
	 */
	@Override
	public void saveFanXian(List<CashBackExcelModel> cashBackForExcelList) {
		// 查出现有的数据,机器号找出来
		List<CashBackEntity> cashBackExcelModelList = cashBackDao.findAll();
		Set<String> set = new HashSet<String>();
		for (CashBackEntity cashBackEntity : cashBackExcelModelList) {
			set.add(cashBackEntity.getMachineId());
		}
		// 数据库已经有的机器号就不添加了
		List<CashBackEntity> list = new ArrayList<CashBackEntity>();
		for (CashBackExcelModel cashBackExcelModel : cashBackForExcelList) {
			if (set.contains(cashBackExcelModel.getMathineId())) {
				continue;
			}
			list.add(new CashBackEntity(cashBackExcelModel));
		}
		cashBackDao.saveAll(list);
	}

	/**
	 * 保存分润收入管理 只要有时间就说明当天的数据已经有了
	 */
	@Override
	public void saveIncome(List<Income> incomeList) {
		// 找出数据库全部时间
		List<Income> IncomeList = incomeDao.findAll();
		Set<Date> set = new HashSet<Date>();
		for (Income income : IncomeList) {
			set.add(income.getTransactionTime());
		}
		// 数据中如果带有这个时间久删除
		List<Income> listFinal = new ArrayList<Income>();
		for (Income income : incomeList) {
			if (set.contains(income.getTransactionTime())) {
				continue;
			}
			listFinal.add(income);
		}
		incomeDao.saveAll(listFinal);

	}

	/**
	 * 注册管理
	 */
	@Override
	public void saveRegist(List<Regist> registExcelList) {
		// TODO Auto-generated method stub

		// 查出现有的数据,机器号找出来
		List<Regist> registList = registDao.findAll();
		Set<String> set = new HashSet<String>();
		for (Regist regist : registList) {
			set.add(regist.getMachineId());
		}
		// 数据库已经有的机器号就不添加了
		List<Regist> list = new ArrayList<Regist>();
		for (Regist regist : registExcelList) {
			if (set.contains(regist.getMachineId())) {
				continue;
			}
			list.add(regist);
		}
		registDao.saveAll(list);
	}

	/**
	 * 交易管理
	 */
	
	@Override
	public void saveTransaction(List<Transaction> transactionForExcelList) {
		// 找出数据库全部时间
		List<Transaction> transactionList = transactionDao.findAll();
		Set<Date> set = new HashSet<Date>();
		for (Transaction transaction : transactionList) {
			set.add(transaction.getTransactionTime());
		}
		// 数据中如果带有这个时间久删除
		List<Transaction> listFinal = new ArrayList<Transaction>();
		for (Transaction transaction : transactionForExcelList) {
			if (set.contains(transaction.getTransactionTime())) {
				continue;
			}
			listFinal.add(transaction);
		}
		transactionDao.saveAll(listFinal);

	}

	@Override
	public void saveBusiness(List<Business> businessExcelList) {

		// 查出现有的数据,机器号找出来
		List<Business> businessList = businessDao.findAll();
		Set<String> set = new HashSet<String>();
		for (Business business : businessList) {
			set.add(business.getMachineId());
		}
		// 数据库已经有的机器号删除重新插入
		List<Business> list = new ArrayList<Business>();
		for (Business business : businessExcelList) {
			if (set.contains(business.getMachineId())) {
				list.add(business);
			}	
		}
		businessDao.deleteAll(list);
		businessDao.saveAll(businessExcelList);
		
	}

}
