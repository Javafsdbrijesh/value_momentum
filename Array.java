package arrays;

public class Array {
	 static int a[]= {20,40,60,70};
	 void ad() {
		 int i;
		 int max=a[0];
		 for(i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max = a[i];
			 }
		 }
	 }
	 public static void main(String []arg)
	 {
		 Array g = new Array();
		 
	 }
}