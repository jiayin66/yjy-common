package com.blw.yjycommon.model;

import java.util.Date;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
/**
 * excel导入模板
 * @author yjy
 *
 */
public class CashBackExcelModel {
	
	@Excel(name = "机器号", orderNum = "3")
	@ApiModelProperty("机器编号商户号")
	private String mathineId;
	
	@Excel(name = "扣款日期", orderNum = "4",importFormat="yyyy-MM-dd",exportFormat="yyyy-MM-dd")
	@ApiModelProperty("扣款日期")
	private Date feeTime;
	
	@Excel(name = "交易扫描日期起", orderNum = "5",importFormat="yyyy-MM-dd",exportFormat="yyyy-MM-dd")
	@ApiModelProperty("3月开始日期")
	private Date saleStartTime;
	
	@Excel(name = "交易扫描日期止", orderNum = "6",importFormat="yyyy-MM-dd",exportFormat="yyyy-MM-dd")
	@ApiModelProperty("3月后时间")
	private Date saleEndTime;
	
	@Excel(name = "返现人", orderNum = "8")
	@ApiModelProperty("返现人")
	private String cashBackPerson;
	
	@Excel(name = "可返现日期", orderNum = "11",importFormat="yyyy-MM-dd",exportFormat="yyyy-MM-dd")
	@ApiModelProperty("返现月份")
	private Date cashBackMonth;
	
	@Excel(name = "一级代理", orderNum = "14")
	@ApiModelProperty("一级代理")
	private String firstEngent;
	
	@Excel(name = "二级代理", orderNum = "15")
	@ApiModelProperty("二级代理")
	private String secondEngent;
	
	@Excel(name = "三级代理", orderNum = "16")
	@ApiModelProperty("三级代理")
	private String thirdEngent;
	
	@Excel(name = "四级代理", orderNum = "17")
	@ApiModelProperty("四级代理")
	private String fourthEngent;
	
	@Excel(name = "流水号", orderNum = "18")
	@ApiModelProperty("流水号")
	private String flowId;

	

	public String getMathineId() {
		return mathineId;
	}

	public void setMathineId(String mathineId) {
		this.mathineId = mathineId;
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

	@Override
	public String toString() {
		return "CashBackExcelModel [mathineId=" + mathineId + ", feeTime=" + feeTime + ", saleStartTime="
				+ saleStartTime + ", saleEndTime=" + saleEndTime + ", cashBackPerson=" + cashBackPerson
				+ ", cashBackMonth=" + cashBackMonth + ", firstEngent=" + firstEngent + ", secondEngent=" + secondEngent
				+ ", thirdEngent=" + thirdEngent + ", fourthEngent=" + fourthEngent + ", flowId=" + flowId + "]";
	}

}
