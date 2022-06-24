public class Employe {



private String name;
private Integer age;
private String city;
private Department1 department;

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
public Department1 getDepartment() {
return department;
} public void setDepartment(Department1 department)
{ this.department = department; }
public Employe(String name, Integer age, String city, Department1 department) {
super();
this.name = name;
this.age = age;
this.city = city;
this.department= department; }
public Employe() {

}
public String toString() { return "Employee [name=" + name + ", age=" + age + ", city=" + city + ", department=" + department + "]"; }

}