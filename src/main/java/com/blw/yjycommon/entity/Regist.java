package com.blw.yjycommon.entity;

import java.io.Serializable;
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
 * 注册管理
 * @author yjy
 *
 */
@Entity
@Table(name = "REGIST")
@ApiModel(value = "注册管理")
public class Regist implements Serializable {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
    private String id;
	
	@Column(name ="ANGENT")
	@Excel(name = "代理", orderNum = "1")
    private String angent;
	
	@Column(name ="MACHINE_ID")
	@Excel(name = "机器", orderNum = "2")
    private String machineId;
	
	@Column(name ="BUSINESS_ID")
	@Excel(name = "商户号", orderNum = "3")
    private String businessId;
	
	@Column(name ="ENDPOINT_ID")
	@Excel(name = "终端号", orderNum = "4")
    private String endpointId;
	
	@Column(name ="PHONE")
	@Excel(name = "手机号", orderNum = "5")
    private String phone;
	
	@Column(name ="REGIST_TIME")
	@Excel(name = "时间", orderNum = "6", importFormat = "yyyy/MM/dd HH:mm:ss", exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date registTime;
	

   

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAngent() {
        return angent;
    }

    public void setAngent(String angent) {
        this.angent = angent;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

   
}