public class Assignment21 {

private String name;

private Integer age;

private String city;

privateDepartment department;

@Override

public String toString() {

return "Assignment21 [name=" + name + ", age=" + age + ", city=" + city + ", department=" + department

+ "]";

}

public String getName() {

return name;

}

public void setName(Stringname) {

this.name = name;

}

public Integer getAge() {

return age;

}

public void setAge(Integerage) {

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

}

public void setDepartment(Department department) {

this.department = department;

}

public Assignment21(String name, Integer age, String city, Department department) {

super();

this.name = name;

this.age = age;

this.city = city;

this.department = department;

}







}