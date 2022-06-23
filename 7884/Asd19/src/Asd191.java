
import java.util.*;
public class Asd191 {



public static void main(String[] args) {



List<String> versions = new ArrayList<>();
versions.add("My name is Rohith");
versions.add("I'm from GITAM University Hyderabad");
versions.add("I'm from Ece Dept.");
versions.add("1024");
versions.add("My cgpa is 7.01");
System.out.println("Length greater than 10");
versions.stream()
.filter(s -> s.length() > 10)
.forEach(System.out::println);



System.out.println("first element which has letter 'M' ");
String first = versions.stream()
.filter(s -> s.contains("e"))
.findFirst().get();
System.out.println(first);



// Using multiple filter
System.out.println("Length greater than 5 and starts with 'I'");
versions.stream()
.filter(s -> s.length() > 8)
.filter(s -> s.startsWith("I"))
.forEach(System.out::println);



}



}