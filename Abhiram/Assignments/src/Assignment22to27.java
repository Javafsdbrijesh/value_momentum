import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Assignment22to27 {
	  public static void main(String[] args) {
		  
		    Department account = new Department("Account", 75); 
	        Department hr = new Department("HR", 50);
	        Department ops = new Department("OP", 25);
	        Department tech = new Department("Tech", 150);   
	 
	        List<Assignment22> employeeList = Arrays.asList(
	                new  Assignment22("Vishal", 32, "Pune", account), 
	                new  Assignment22("Rama", 25, "Noida", hr),
	                new  Assignment22("Aniket", 45, "Delhi", ops),
	                new  Assignment22("Sumanth", 65, "Noida", hr),
	                new  Assignment22("Siri", 55, "Pune", hr),
	                new  Assignment22("Abhiram", 23, "Noida", ops),
	                new  Assignment22("Saivineeth", 30, "Delhi", tech),
	                new  Assignment22("Arvind", 29, "Pune", tech),
	                new  Assignment22("Gopinath", 20, "Delhi", ops),
	                new  Assignment22("Ramesh", 32, "Pune", account),
	                new  Assignment22("Rohith", 31, "Noida", hr));

	        
	//Assignment 22: Find all employees who lives in ‘Noida’ city. BAsed on shared Employee department table.       
	        employeeList.stream()
	        .filter(x -> x.getCity().equalsIgnoreCase("Noida"))
	        .forEach(System.out::println);
	        
	        System.out.println("\nEmployees in Noida after sorting : ");
	       
	//Assignment 23: Find all employees who lives in ‘Noida’ city, sort them by their name and print the names of employees.  
	        employeeList.stream()
	        .filter(x -> x.getCity().equalsIgnoreCase("Noida"))
	        .sorted(Comparator.comparing(Assignment22 :: getName))
	        .forEach(e -> System.out.println(e.getName()));
	        
	       
	        System.out.println("\nTypes of Department branches present are:  ");
	        
   //Assignment 24: Find distinct department names that employees work for.
	        employeeList.stream()
	        .map(e -> e.getDepartment().getDepartmentName())
	        .distinct()
	        .forEach(System.out :: println);
	        
	        System.out.println("\nDepartments having more than 50 employees : ");
	        
 //Assignment 25: Find department names thats these employees work for, where no of employee in dept > 50.
	        employeeList.stream()
	        .map(Assignment22 :: getDepartment)
	        .filter(d -> d.getNoOfEmployees() >50)
	        .distinct()
	        .forEach(y -> System.out.println(y.getDepartmentName()));
	        
	        System.out.println("\nEmployee names who working in Accounts: ");
	        
  //Assignment 26: Print all employee's names who are working for account department.
	        employeeList.stream()
	        .filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("Account"))
	        .map(Assignment22 :: getName)
	        .forEach(System.out :: println);
	       
	        System.out.println("\nNumnber of employees in each department: ");
	        
  //Assignment 27: Print highest number of employees in all departments.
	        employeeList.stream()
	        .map(d -> d.getDepartment().getNoOfEmployees())
	        .distinct()
	        .forEach(System.out::println);

	        
	  }
}