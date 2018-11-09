package com.blw.yjycommon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blw.yjycommon.entity.CashBackEntity;
import com.blw.yjycommon.entity.Income;

public interface IncomeDao extends JpaRepository<Income, String>{
	
}
