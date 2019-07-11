package com.springboot.msl.sbdemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable {
	private Long pid;
	private String pname;
	private String modelType="ST-2019TR";
	private BigDecimal price = new BigDecimal(0);
	private Date buildTime = new Date();
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(Date buildTime) {
		this.buildTime = buildTime;
	}
	public Product(Long pid, String pname, String modelType) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.modelType = modelType;
	}
	
	
}
