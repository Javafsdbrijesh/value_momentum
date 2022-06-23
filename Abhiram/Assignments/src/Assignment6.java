//Assignment 6: Write a Java program to find the index of an array element.

public class Assignment6 {
       public static int findIndex (int a[], int t) {
        if (a == null) {
        	return -1;
        }
        int len = a.length;
        int i = 0;
        while (i < len) {
            if (a[i] == t) {
            	return i;
            }
            else {
            	i=i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int a[] = {17,32,18,7,175,333,10,1};
      System.out.println("Index position of 18 is: " + findIndex(a, 18));
      System.out.println("Index position of 333 is: " + findIndex(a, 333));
      System.out.println("Index position of 17 is: " + findIndex(a, 17));
      
       }
}