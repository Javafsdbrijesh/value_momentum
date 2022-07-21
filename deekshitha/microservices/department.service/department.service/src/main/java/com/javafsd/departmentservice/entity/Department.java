package com.javafsd.departmentservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * @Column(name="department_id")
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_generator")
	@SequenceGenerator(name="department_generator", sequenceName = "department_seq", allocationSize=50)
	@Column(name = "department_id", updatable = false, nullable = false)
	private long departmentId;
	
	@NotBlank(message="Please Add Department Name")
	//@Size(min = 2, max = 5, message = "Department Name length is not valid")
	//@Positive
	//@Negative
	//@NegativeOrZero
	//@PositiveOrZero
	//@Email
	private String departmentName;
	
	@Column(name="department_address")
	private String departmentAddress;
	
	@Column(name="department_code")
	private String departmentCode;
}