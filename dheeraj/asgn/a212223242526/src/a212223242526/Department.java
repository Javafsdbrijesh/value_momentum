package a212223242526;
public class Department {
private String departmentName;
@Override
public String toString() {
return "Department [departmentName=" + departmentName + ", noOfEmployees=" + noOfEmployees + "]";
}
public String getDepartmentName() {
return departmentName;
}
public void setDepartmentName(String departmentName) {
this.departmentName = departmentName;
}
public Integer getNoOfEmployees() {
return noOfEmployees;
}
public void setNoOfEmployees(Integer noOfEmployees) {
this.noOfEmployees = noOfEmployees;
}
public Department(String departmentName, Integer noOfEmployees) {
super();
this.departmentName = departmentName;
this.noOfEmployees = noOfEmployees;
}
public Department(String departmentName2, int noOfEmployees2) {
	// TODO Auto-generated constructor stub
}
private Integer noOfEmployees;
}