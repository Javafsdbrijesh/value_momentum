
import java.util.Arrays; 
public class RemoveEle {
 
public static void main(String[] args) {
   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   int removeIndex = 1;

   for(int i = removeIndex; i <array.length -1; i++){
        array[i] = array[i + 1];
      }
    System.out.println(Arrays.toString(array));
 }
 }
