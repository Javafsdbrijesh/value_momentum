package jun1517;
//Assignment 8: Insert an element {9} into array at 3rd index.
//int[] testArray = new int[]{2,1,6,3,10,30,20,11,4};
public class Assign8 {
	public static void main(String[]args) {
		int[]or= {1,4,5,6,7};
		int g=4;
		int ind=3;//index val
		int[]mr=new int[or.length+1];
		for(int i=0,k=0;i<or.length;i++) {
			if(i<ind) {
				mr[i]=or[i];
			}
			else if(i>ind) {
				mr[i+1]=or[i];
			}
			else {
				mr[i]=g;
				mr[i+1]=or[i];
			}
		}
		for(int z=0;z<mr.length;z++) {
			System.out.println(mr[z]);
		}
	}

}
