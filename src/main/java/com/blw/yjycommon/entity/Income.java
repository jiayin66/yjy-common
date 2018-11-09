package com.blw.yjycommon.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModel;

/**
 * 分润管理
 * 
 * @author yjy
 *
 */
@Entity
@Table(name = "INCOME")
@ApiModel(value = "分润管理")
public class Income implements Serializable {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	
	@Column(name ="MACHINE_ID")
	@Excel(name = "商户名", orderNum = "2")
	private String machineId;
	@Column(name ="NUMBER")
	@Excel(name = "交易金额", orderNum = "3")
	private BigDecimal number;
	@Column(name ="SECOND_AGENT")
	@Excel(name = "二级代理", orderNum = "4")
	private String secondAgent;
	@Column(name ="SECOND_INCOME")
	@Excel(name = "二级分润金额", orderNum = "5")
	private BigDecimal secondIncome;
	@Column(name ="THIRD_AGENT")
	@Excel(name = "三级代理", orderNum = "6")
	private String thirdAgent;
	@Column(name ="THIRD_INCOME")
	@Excel(name = "三级分润金额", orderNum = "7")
	private BigDecimal thirdIncome;
	@Column(name ="FOURTH_AGENT")
	@Excel(name = "四级代理", orderNum = "8")
	private String fourthAgent;
	
	@Column(name ="FOURTH_INCOME")
	@Excel(name = "四级分润金额", orderNum = "9")
	private BigDecimal fourthIncome;
	
	@Column(name ="TRANSACTION_TIME")
	@Excel(name = "交易时间", orderNum = "10", importFormat = "yyyyMMdd", exportFormat = "yyyy-MM-dd")
	private Date transactionTime;
	
	@Column(name ="TRANSACTION_TYPE")
	@Excel(name = "交易类型", orderNum = "11")
	private String transactionType;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public BigDecimal getNumber() {
		return number;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getSecondAgent() {
		return secondAgent;
	}

	public void setSecondAgent(String secondAgent) {
		this.secondAgent = secondAgent;
	}

	public BigDecimal getSecondIncome() {
		return secondIncome;
	}

	public void setSecondIncome(BigDecimal secondIncome) {
		this.secondIncome = secondIncome;
	}

	public String getThirdAgent() {
		return thirdAgent;
	}

	public void setThirdAgent(String thirdAgent) {
		this.thirdAgent = thirdAgent;
	}

	public BigDecimal getThirdIncome() {
		return thirdIncome;
	}

	public void setThirdIncome(BigDecimal thirdIncome) {
		this.thirdIncome = thirdIncome;
	}

	public String getFourthAgent() {
		return fourthAgent;
	}

	public void setFourthAgent(String fourthAgent) {
		this.fourthAgent = fourthAgent;
	}

	public BigDecimal getFourthIncome() {
		return fourthIncome;
	}

	public void setFourthIncome(BigDecimal fourthIncome) {
		this.fourthIncome = fourthIncome;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
}