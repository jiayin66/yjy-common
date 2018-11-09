package com.blw.yjycommon.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.blw.yjycommon.model.CashBackExcelModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 激活返现管理
 * @author yjy
 *
 */
@Entity
@Table(name = "CASHBACK")
@ApiModel(value = "激活管理")
public class CashBackEntity {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	private String id;
	
	@ApiModelProperty("机器编号商户号")
	@Column(name = "MACHINE_ID")
	private String machineId;
	
	
	@Column(name = "FEE_TIME")
	@ApiModelProperty("扣款日期")
	private Date feeTime;
 
	@Column(name = "SELE_START_TIME")
	@ApiModelProperty("3月开始日期")
	private Date saleStartTime;
	
	@Column(name = "SALE_END_TIME")
	@ApiModelProperty("3月后时间")
	private Date saleEndTime;
	
	@Column(name = "CASHBACK_PERSON")
	@ApiModelProperty("返现人")
	private String cashBackPerson;
	  
	@Column(name = "CASHBACK_MONTH")
	@ApiModelProperty("返现月份")
	private Date cashBackMonth;
	         
	@Column(name = "FIRST_AGENT")
	@ApiModelProperty("一级代理")
	private String firstEngent;
	
	@Column(name = " SECOND_AGENT")
	@ApiModelProperty("二级代理")
	private String secondEngent;
	
	@Column(name = "THIRD_AGENT")
	@ApiModelProperty("三级代理")
	private String thirdEngent;
	
	@Column(name = "FOURTH_AGENT")
	@ApiModelProperty("四级代理")
	private String fourthEngent;
	
	@Column(name = "FLOW_ID")
	@ApiModelProperty("流水号")
	private String flowId;

	

	public CashBackEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashBackEntity(CashBackExcelModel cashBackExcelModel) {	
		super();
		 this.machineId=cashBackExcelModel.getMathineId();
		 this.feeTime=cashBackExcelModel.getFeeTime();
		 this.saleStartTime=cashBackExcelModel.getSaleStartTime();
		 this.saleEndTime=cashBackExcelModel.getSaleEndTime();
		 this.cashBackPerson=cashBackExcelModel.getCashBackPerson();
		 this.cashBackMonth=cashBackExcelModel.getCashBackMonth();
		 this.firstEngent=cashBackExcelModel.getFirstEngent();
		 this.secondEngent=cashBackExcelModel.getSecondEngent();
		 this.thirdEngent=cashBackExcelModel.getThirdEngent();
		 this.fourthEngent=cashBackExcelModel.getFourthEngent();
		 this.flowId=cashBackExcelModel.getFlowId();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFeeTime() {
		return feeTime;
	}

	public void setFeeTime(Date feeTime) {
		this.feeTime = feeTime;
	}

	public Date getSaleStartTime() {
		return saleStartTime;
	}

	public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getCashBackMonth() {
		return cashBackMonth;
	}

	public void setCashBackMonth(Date cashBackMonth) {
		this.cashBackMonth = cashBackMonth;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMathineId(String machineId) {
		this.machineId = machineId;
	}


	public String getCashBackPerson() {
		return cashBackPerson;
	}

	public void setCashBackPerson(String cashBackPerson) {
		this.cashBackPerson = cashBackPerson;
	}

	

	public String getFirstEngent() {
		return firstEngent;
	}

	public void setFirstEngent(String firstEngent) {
		this.firstEngent = firstEngent;
	}

	public String getSecondEngent() {
		return secondEngent;
	}

	public void setSecondEngent(String secondEngent) {
		this.secondEngent = secondEngent;
	}

	public String getThirdEngent() {
		return thirdEngent;
	}

	public void setThirdEngent(String thirdEngent) {
		this.thirdEngent = thirdEngent;
	}

	public String getFourthEngent() {
		return fourthEngent;
	}

	public void setFourthEngent(String fourthEngent) {
		this.fourthEngent = fourthEngent;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}


	 
}
