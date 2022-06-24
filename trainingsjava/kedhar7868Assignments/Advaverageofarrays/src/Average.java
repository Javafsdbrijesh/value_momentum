import java.util.Arrays;
public class Average {
	
public static void main(String[] args) {
	int[] numbers = new int[]{5,7,323,75,24,898,37};
    
    int sum = 0;
    for(int i=0; i < numbers.length ; i++)
    	
     sum = sum + numbers[i];
    
     double average = sum / numbers.length;
     System.out.println("Average: " + average );
}
}