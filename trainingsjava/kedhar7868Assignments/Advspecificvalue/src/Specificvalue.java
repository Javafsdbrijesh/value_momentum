public class Specificvalue {
  public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {
            4,66,7,223,5756,1343,977,365,45865};
      System.out.println(contains(my_array1, 365));
      System.out.println(contains(my_array1, 475));
   }
}
