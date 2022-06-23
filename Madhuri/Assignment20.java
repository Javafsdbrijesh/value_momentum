import java.util.Arrays;
import java.util.List;


public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("java","python","angular");
		list.stream().filter(t -> t.startsWith("a")).forEach(x->System.out.println(x));
		list.stream().filter(t-> t.endsWith("a")).forEach(x-> System.out.println(x));
        list.stream().filter( str -> str.length() > 5).forEach(x->System.out.println(x));

	}

}
