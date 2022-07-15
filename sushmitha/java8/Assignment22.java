package advjava6;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Assignment22 {

	public static void main(String[] args) {
		Department account = new Department("Account", 75);
		Department hr = new Department("HR", 50);
		Department ops = new Department("OP", 25);
		Department tech = new Department("Tech", 150);

		List<Employee> employeeList = Arrays.asList(
		new Employee("Vishal", 32, "Pune", account),
		new Employee("Rama", 25, "Noida", hr),
		new Employee("Aniket", 45, "Delhi", ops),
		new Employee("Sumanth", 65, "Noida", hr),
		new Employee("Siri", 55, "Pune", hr),
		new Employee("Abhiram", 23, "Noida", ops),
		new Employee("Saivineeth", 30, "Delhi", tech),
		new Employee("Arvind", 29, "Pune", tech),
		new Employee("Gopinath", 20, "Delhi", ops),
		new Employee("Ramesh", 32, "Pune", account),
		new Employee("Rohith", 31, "Noida", hr));

		employeeList.stream()
		.filter(x -> x.getCity().equalsIgnoreCase("Noida"))
		.sorted(Comparator.comparing(Employee::getName))
		.forEach(e -> System.out.println(e.getName()));
		}

}