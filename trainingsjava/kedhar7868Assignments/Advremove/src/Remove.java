import java.util.Arrays; 
public class Remove {
 
public static void main(String[] args) {
   int[] myarray = {56,3546,963,564,3,465,78,35,243,97765,4543,295};
   
   System.out.println("Original Array : "+Arrays.toString(myarray));
   
   
   int removeIndex = 6;
   
   System.out.println("\nElement that will be removed is "+myarray[removeIndex]);
   
   for(int i = removeIndex; i < myarray.length -1; i++){
        myarray[i] = myarray[i + 1];
      }
   

   
   System.out.println("\nAfter removing the  element: "+Arrays.toString(myarray));
   
   
 }
 }
