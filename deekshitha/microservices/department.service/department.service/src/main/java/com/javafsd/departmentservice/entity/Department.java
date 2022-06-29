package com.javafsd.departmentservice.entity;

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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="department_id")
	private long departmentId;
	
	@Column(name="department_Name")
	private String departmentName;
	
	@Column(name="department_Address")
	private String departmentAddress;
	
	@Column(name="department_Code")
	private String departmentCode;
}
	

