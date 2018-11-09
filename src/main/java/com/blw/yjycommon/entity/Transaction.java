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
 * 交易管理
 * @author yjy
 *
 */
@Entity
@Table(name = "TRANSACTION")
@ApiModel(value = "交易管理")
public class Transaction implements Serializable {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
    private String id;
	
	@Column(name ="MACHINE_ID")
	@Excel(name = "商户名", orderNum = "1")
    private String machineId;
	
	@Column(name ="NUMBER")
	@Excel(name = "交易金额", orderNum = "4")
    private BigDecimal number;
	
	/**
	 * 备注这个Excel中的时间不知道什么格式，里面的东西不是空格，直接从报错信息中复制过来的。至今不知道什么玩意。
	 */
	@Column(name ="TRANSACTION_TIME")
	@Excel(name = "交易时间", orderNum = "5", importFormat = "yyyyMMdd HHmmss", exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date transactionTime;
	
	
	@Column(name ="TRANSACTION_TYPE")
	@Excel(name = "处理标记", orderNum = "6")
    private String transactionType;
	
	@Column(name ="TAG")
	@Excel(name = "冲正标记", orderNum = "7")
    private String tag;
	
	@Column(name ="TRANSACTION_NUMBER")
	@Excel(name = "交易参考号", orderNum = "8")
    private String transactionNumber;
   
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

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

   

    public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}