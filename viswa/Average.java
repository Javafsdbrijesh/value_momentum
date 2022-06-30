
public class Average {
	 public static void main(String[] args) {
	        
	        int[] ele = new int[]{1,2,3,4,5};
	        int s=0;
	        int length = ele.length;

	        for(int i=0; i<ele.length; i++){
	            s=s+ele[i];
	        }
	        double average = s / length;
	        System.out.println(average);
	    
	    }

}
