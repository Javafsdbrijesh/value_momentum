//Assignment 5: Write a Java program to test if an array contains a specific value.

public class Assignment5 {
  public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int a[] = {17,32,18,7,175,333,10,1};
      System.out.println(contains(a, 18));
      System.out.println(contains(a, 20));
      System.out.println(contains(a, 17));
      
   }
}