package studentclass;

public class Department {

	public static void main(String[] args) {
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
		private Integer noOfEmployees;







		}// TODO Auto-generated method stub

	}


