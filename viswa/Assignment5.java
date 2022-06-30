
public class Assignment5 {
	  public static void main(String[] args) {
	        int[] ele = {1,2,3,4,5,6,7,8,9};
	        
	        System.out.println(contains(ele,11));
	        System.out.println(contains(ele,1));
	    
	    }
	    public static boolean contains(int[] arr, int num){
	         for(int k : arr){
	            if(num == k){
	                return true;
	            }
	         }
	         return false;
	    }

}
