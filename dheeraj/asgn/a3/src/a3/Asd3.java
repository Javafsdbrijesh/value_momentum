package a3;

public class Asd3 {
public static void main(String []args) {
int[] arr2= {23,45,56,12,34,78};
int i,sum=0,avg = 0;
for(i=0;i<arr2.length;i++) {
sum= sum+arr2[i];
avg=sum/(arr2.length);
}
System.out.println(avg);
}



}