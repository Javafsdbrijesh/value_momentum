package com.javafsd.userservice.vo;

public class DepartmenView 
{
	private Long departmenId;
    private String departmenName;    
    private String departmenAddress;    
    private String departmenCode;
    
	public DepartmenView() 
	{
		super();
	}

	public DepartmenView(Long departmenId, String departmenName, String departmenAddress, String departmenCode) {
		super();
		this.departmenId = departmenId;
		this.departmenName = departmenName;
		this.departmenAddress = departmenAddress;
		this.departmenCode = departmenCode;
	}

	@Override
	public String toString() {
		return "DepartmenView [departmenId=" + departmenId + ", departmenName=" + departmenName + ", departmenAddress="
				+ departmenAddress + ", departmenCode=" + departmenCode + "]";
	}

	public Long getDepartmenId() {
		return departmenId;
	}

	public void setDepartmenId(Long departmenId) {
		this.departmenId = departmenId;
	}

	public String getDepartmenName() {
		return departmenName;
	}

	public void setDepartmenName(String departmenName) {
		this.departmenName = departmenName;
	}

	public String getDepartmenAddress() {
		return departmenAddress;
	}

	public void setDepartmenAddress(String departmenAddress) {
		this.departmenAddress = departmenAddress;
	}

	public String getDepartmenCode() {
		return departmenCode;
	}

	public void setDepartmenCode(String departmenCode) {
		this.departmenCode = departmenCode;
	}
    
    
}
