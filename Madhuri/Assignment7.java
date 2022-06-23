import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  n,num, flag = 1, index = 0;
	        Scanner s = new Scanner(System.in);  
	        int a[]= {3,5,7,10,4};
	        n=a.length;
	        System.out.print("Enter the element you want to delete:");
	        num = s.nextInt();
	        for (int i = 0; i < n; i++) 
	        {
	            if(a[i] == num)
	            {
	                flag =1;
	                index = i;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
	        {
	            for(int i = index+1; i < n; i++)
	            {
	                a[i-1] = a[i];
	            }
	            
	            for (int i = 0; i <= n-2; i++) 
	            {
	                System.out.print(a[i]+" ");
	            }
	          
	        }
	        else
	        {
	            System.out.println("Element not found");
	        }
	        s.close();
	    }
	

	}


