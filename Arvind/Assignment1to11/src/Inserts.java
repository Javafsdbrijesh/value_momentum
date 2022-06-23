import java.util.Arrays; 
public class Inserts{
 
public static void main(String[] args) {

   int[] my_array = {2,1,6,3,10,30,20,11,4};
   
   int Index_position = 3;
   int newValue    = 9;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }