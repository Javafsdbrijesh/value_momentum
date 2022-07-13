package com.javafsd.departmenservice.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name ="department")
public class Department {

  
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deparment_id")
    private long deparmtmentId;

    @Column(name = "deparment_name")
    private String departmentName;

    @Column(name = "deparment_address")
    private String departmentAddress;

    @Column(name = "deparment_code")
    private String departmentCode;

	/**
	 * @return the deparmtmentId
	 */
	public long getDeparmtmentId() {
		return deparmtmentId;
	}

	/**
	 * @param deparmtmentId the deparmtmentId to set
	 */
	public void setDeparmtmentId(long deparmtmentId) {
		this.deparmtmentId = deparmtmentId;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the departmentAddress
	 */
	public String getDepartmentAddress() {
		return departmentAddress;
	}

	/**
	 * @param departmentAddress the departmentAddress to set
	 */
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	/**
	 * @return the departmentCode
	 */
	public String getDepartmentCode() {
		return departmentCode;
	}

	/**
	 * @param departmentCode the departmentCode to set
	 */
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Department(long deparmtmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.deparmtmentId = deparmtmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public Department() {
		
	}

	@Override
	public String toString() {
		return "Department [deparmtmentId=" + deparmtmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

}