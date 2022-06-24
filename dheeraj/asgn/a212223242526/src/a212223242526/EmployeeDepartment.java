package a212223242526;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class EmployeeDepartment
{
public static void main (String[]args)
{
Department account = new Department("Account", 75);
Department hr = new Department("HR", 50);
Department ops = new Department("OP", 25);
Department tech = new Department("Tech", 150);
List<a21> employeeList = Arrays.asList(
new a21("Vishal", 32, "Pune", account),
new a21("Rama", 25, "Noida", hr),
new a21("Aniket", 45, "Delhi", ops),
new a21("Sumanth", 65, "Noida", hr),
new a21("Siri", 55, "Pune", hr),
new a21("Abhiram", 23, "Noida", ops),
new a21("Saivineeth", 30, "Delhi", tech),
new a21("Arvind", 29, "Pune", tech),
new a21("Gopinath", 20, "Delhi", ops),
new a21("Ramesh", 32, "Pune", account),
new a21("Rohith", 31, "Noida", hr));
//Assignment 21
System.out.println("\nEmployees in Noida after sorting : \n");
employeeList.stream()
.filter(x -> x.getCity().equalsIgnoreCase("Noida"))
.forEach(System.out:: println);
//Assignment 22
employeeList.stream()
.filter(x -> x.getCity().equalsIgnoreCase("Noida"))
.sorted(Comparator.comparing(a21 :: getName))
.forEach(e -> System.out.println(e.getName()));
System.out.println("\nTypes of Department branches present are: ");
//Assignment 23
employeeList.stream()
.map(e -> e.getDepartment().getDepartmentName())
.distinct()
.forEach(System.out :: println);
System.out.println("\nDepartments having more than 50 employees : ");
//Assignment 24
employeeList.stream()
.map(a21 :: getDepartment)
.filter(d -> d.getNoOfEmployees() >50)
.distinct()
.forEach(y -> System.out.println(y.getDepartmentName()));
System.out.println("\nEmployee names who working in Accounts: ");
//Assignment 25
employeeList.stream()
.filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("Account"))
.map(a21 :: getName)
.forEach(System.out :: println);
System.out.println("\nNumnber of emplyees in each department: ");
//Assignment 26
employeeList.stream()
.map(d -> d.getDepartment().getNoOfEmployees())
.distinct()
.forEach(System.out::println);
}
}