
public class Employee {

	private String name;
	private Integer age;
	private String city;
	private Department department;

	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public Integer getAge()
	{
	return age;
	}
	public void
	setAge(Integer age) {
	this.age = age;
	}
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public Department getDepartment() {
	return department;
	} public void setDepartment(Department department)
	{ this.department = department; }
	public Employee(String name, Integer age, String city, Department department) {
	super();
	this.name = name;
	this.age = age;
	this.city = city;
	this.department= department; }
	public Employee() {

	}
	public String toString() { return "Employee [name=" + name + ", age=" + age + ", city=" + city + ", department=" + department + "]"; }

	}