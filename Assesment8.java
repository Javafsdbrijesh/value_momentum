import java.util.Arrays;

public class Assesment8 {
public static void main(String []args) {
int[] testArray = new int[]{2,1,6,3,10,30,20,11,4};
System.out.println("Original array : " + Arrays.toString(testArray));
int indexOf = 3;
int b = 9;
for(int i=testArray.length-1;i>indexOf;i--) {
testArray[i] = testArray[i-1];
}
testArray[indexOf] = b;
System.out.println("New Array : " + Arrays.toString(testArray));
}
}