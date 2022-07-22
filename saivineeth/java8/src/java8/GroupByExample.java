package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class GroupByExample {
public static void main(String[] args) {
List<String> alphabets = Arrays.asList("aa","ff","ee","ww","aa","aa","ww","sss","ee","sss");


Map<String, Long> b =
alphabets.stream()
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


System.out.println( b);

}



}