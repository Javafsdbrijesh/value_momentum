import java.util.Arrays; 
public class As7 {
 
public static void main(String[] args) {
   int[] num = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println(Arrays.toString(num));     
   
 
   int removeIndex = 1;

   for(int i = removeIndex; i < num.length-1; i++){
        num[i] = num[i+1];
      }

    System.out.println(Arrays.toString(num));
 }
 }