package advjava1;

import java.util.Arrays;
import java.util.List;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,6,7,8,11,14,15,29,18,21,20,31,34,38,51,62,71);
		list.stream().filter(num->num%5==0).forEach((num)->System.out.println(num));
		list.stream().filter(e->e<2||e>30).filter(e->e%2==0).forEach((e)->System.out.println(e));

	}

}
