package Assign21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class TestEmployeeDepartment {
    public static void main(String[] args) {
 
        Department account = new Department("Account", 75); 
        Department hr = new Department("HR", 50);
        Department ops = new Department("OP", 25);
        Department tech = new Department("Tech", 150);   
        List<Employee> employeeList = Arrays.asList(
                new  Employee("Vishal", 32, "Pune", account), 
                new  Employee("Rama", 25, "Noida", hr),
                new  Employee("Aniket", 45, "Delhi", ops),
                new  Employee("Sumanth", 65, "Noida", hr),
                new  Employee("Siri", 55, "Pune", hr),
                new  Employee("Abhiram", 23, "Noida", ops),
                new  Employee("Saivineeth", 30, "Delhi", tech),
                new  Employee("Arvind", 29, "Pune", tech),
                new  Employee("Gopinath", 20, "Delhi", ops),
                new  Employee("Ramesh", 32, "Pune", account),
                new  Employee("Rohith", 31, "Noida", hr));
 
        //Find all employees who lives in ‘Noida’ city.
        //1. traverse employee list, filter based on city, getCity();

        employeeList.stream()
            .filter(x -> x.getCity().equalsIgnoreCase("Noida"))
            .sorted(Comparator.comparing(Employee::getName))
            .forEach(System.out::println);

        //Find all employees who lives in ‘Noida’ city, sort them by their name and print the names of employees.
 
        System.out.println("\n -------------------------------");

        employeeList.stream()
            .filter(x -> x.getCity().equalsIgnoreCase("Noida"))
            .sorted(Comparator.comparing(Employee::getName))
            .forEach(e -> System.out.println(e.getName()));

        System.out.println("\n -------------------------------");
        // find distinct depatment names that employees work for

        employeeList.stream()
            .map(e -> e.getDepartment().getDepartmentName())
            .distinct()
            .forEach(System.out::println);

        System.out.println("\n -------------------------------");
        // Find department names thats these employees work for, where no of employee in dept > 50
        employeeList.stream()
            .map(Employee::getDepartment)
            .filter(d -> d.getNoOfEmployees() > 50)
            .distinct()
            .forEach( d-> System.out.println(d.getDepartmentName()));


        System.out.println("\n -------------------------------");
        //Print all employee's names who are working for account department 
        employeeList.stream()
            .filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
            .map(Employee::getName)
            .forEach(System.out::println);

        System.out.println("\n -------------------------------");
        //print highest number of employees in all departments
        employeeList.stream()
            .map(e-> e.getDepartment().getNoOfEmployees())
            .reduce(Integer::max)
            .ifPresent(System.out::println);

    }
}