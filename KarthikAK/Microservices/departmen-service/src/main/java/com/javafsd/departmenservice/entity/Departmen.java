package com.javafsd.departmenservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departmen")
public class Departmen 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departmen_id")
	private long departmenId;
	
	@Column(name = "departmen_name")
	private String departmenName;
	
	@Column(name = "departmen_address")
	private String departmenAddress;
	
	@Column(name = "departmen_code")
	private String departmenCode;

	public long getDepartmenId() {
		return departmenId;
	}

	public void setDepartmenId(long departmenId) {
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
