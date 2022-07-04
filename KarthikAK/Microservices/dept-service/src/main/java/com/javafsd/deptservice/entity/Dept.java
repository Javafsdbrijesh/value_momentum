package com.javafsd.deptservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept 
{	
	public long getDeptId()
	{
		return deptId;
	}
	
	public void setDeptId(long deptId)
	{
		this.deptId = deptId;
	}
	
	public String getDeptName()
	{
		return deptName;
	}
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	public String getDeptAddress()
	{
		return deptAddress;
	}
	
	public void setDeptAddress(String deptAddress)
	{
		this.deptAddress = deptAddress;
	}
	
	public String getDeptCode()
	{
		return deptCode;
	}
	
	public void setDeptCode(String deptCode)
	{
		this.deptCode = deptCode;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "dept_id")
	private long deptId;
	
	@Column(name = "dept_name")
	private String deptName;
	
	@Column(name = "dept_Address")
	private String deptAddress;
	
	@Column(name = "dept_Code")
	private String deptCode;
}
