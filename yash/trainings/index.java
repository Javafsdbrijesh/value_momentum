//indexing the  array elements assignment 6 
package trainings;

public class index {

	public static void main(String[] args) {
		int[] a=new int[] {
				8,9,2,10,5
		};
		int num=10;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				System.out.println(i);
			}
		}

	}

}
