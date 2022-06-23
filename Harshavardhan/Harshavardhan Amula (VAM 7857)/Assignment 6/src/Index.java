
import java.util.Arrays;
 
public class Index {
 
   
    public static int findIndex(int arr[], int t)
    {
 
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
    
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
 
       
        System.out.println("Index of 5 is: "
                           + findIndex(array, 5));
    }
}