package com.javafsd.userservice.vo;

public class DepartmentView {
 private Long departmantId;
 private String departmentName;
 private String departmentAddress;
 private String departmentCode;
/**
 * @return the departmantId
 */
public Long getDepartmantId() {
	return departmantId;
}
/**
 * @param departmantId the departmantId to set
 */
public void setDepartmantId(Long departmantId) {
	this.departmantId = departmantId;
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
public DepartmentView() {
	
}
@Override
public String toString() {
	return "DepartmentView [departmantId=" + departmantId + ", departmentName=" + departmentName
			+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
}
 
}