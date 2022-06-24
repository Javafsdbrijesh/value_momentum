import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestEmployeeDepartment {
public static void main(String[] args) {

Department1 account = new Department1("Account", 75);
Department1 hr = new Department1("HR", 50);
Department1 ops = new Department1("OP", 25);
Department1 tech = new Department1("Tech", 150);

List<Employe> employeeList = Arrays.asList(
new Employe("Vishal", 32, "Pune", account),
new Employe("Rama", 25, "Noida", hr),
new Employe("Aniket", 45, "Delhi", ops),
new Employe("Sumanth", 65, "Noida", hr),
new Employe("Siri", 55, "Pune", hr),
new Employe("Abhiram", 23, "Noida", ops),
new Employe("Saivineeth", 30, "Delhi", tech),
new Employe("Arvind", 29, "Pune", tech),
new Employe("Gopinath", 20, "Delhi", ops),
new Employe("Ramesh", 32, "Pune", account),
new Employe("Rohith", 31, "Noida", hr));

//Find all employees who lives in ‘Noida’ city.
//1. traverse employee list, filter based on city, getCity();



employeeList.stream()
.filter(x -> x.getCity().equalsIgnoreCase("Noida"))
.sorted(Comparator.comparing(Employe::getName))
.forEach(System.out::println);
}
}