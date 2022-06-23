//Assignment 22: Find all employees who lives in ‘Noida’ city. BAsed on shared Employee department table.

public class Assignment22 {
private String name;
private Integer age;
private String city;
private String department;
@Override
public String toString() {
return "Assignment22 [name=" + name + ", age=" + age + ", city=" + city + ", department=" + department
+ "]";
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Integer getAge() {
return age;
}
public void setAge(Integer age) {
this.age = age;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public 	String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public Assignment22(String name, Integer age, String city, String department) {
super();
this.name = name;
this.age = age;
this.city = city;
this.department = department;
}
}

