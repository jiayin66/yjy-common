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
import io.swagger.annotations.ApiModelProperty;

/**
 * 商户管理（输入）
 * @author yjy
 *
 */
@Entity
@Table(name = "BUSINESS")
@ApiModel(value = "商户管理")
public class Business implements Serializable {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	private String id;
	
	@Excel(name = "机器编号商户号", orderNum = "1")
	@Column(name ="MACHINE_ID")
	@ApiModelProperty("机器编号商户号")
    private String machineId;
	
	@Excel(name = "姓名", orderNum = "2")
	@Column(name ="NAME")
	@ApiModelProperty("姓名")
    private String name;
	
	@Excel(name = "手机号", orderNum = "2")
	@Column(name ="PHONE")
	@ApiModelProperty("手机号")
    private String phone;
	
	@Excel(name = "地址", orderNum = "2")
	@Column(name ="ADDRESS")
	@ApiModelProperty("地址")
    private String address;
	
	@Excel(name = "备注", orderNum = "2")
	@Column(name ="REMARK")
	@ApiModelProperty("备注")
    private String remark;
	
	@Excel(name = "快递", orderNum = "2")
	@Column(name ="EXPRESS")
	@ApiModelProperty("快递")
    private String express;
	
	@Excel(name = "快递费", orderNum = "2")
	@Column(name ="EXPRESS_COST")
	@ApiModelProperty("快递费")
    private BigDecimal expressCost;
	
	@Excel(name = "是否注册", orderNum = "2")
	@Column(name ="STATUS")
	@ApiModelProperty("是否注册")
    private Integer status;
	
	@Excel(name = "机器编号商户号返现", orderNum = "2")
	@Column(name ="COST")
	@ApiModelProperty("机器编号商户号返现")
    private BigDecimal cost;
	
	@Excel(name = "创建时间", orderNum = "2")
	@Column(name ="CREATE_TIME")
	@ApiModelProperty("创建时间")
    private Date createTime;
	
	@Excel(name = "修改时间", orderNum = "2")
	@Column(name ="MODIFY_TIME")
	@ApiModelProperty("修改时间")
    private Date modifyTime;
	
	@Excel(name = "是否达标", orderNum = "2")
	@Column(name ="IS_REACH")
	@ApiModelProperty("是否达标")
    private Integer isReach;

    public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public BigDecimal getExpressCost() {
        return expressCost;
    }

    public void setExpressCost(BigDecimal expressCost) {
        this.expressCost = expressCost;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsReach() {
        return isReach;
    }

    public void setIsReach(Integer isReach) {
        this.isReach = isReach;
    }
}