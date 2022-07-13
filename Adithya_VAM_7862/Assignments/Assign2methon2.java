package jun1517;

public class Assign2methon2 {
	public static void main(String[]args) {
		String[]a= {"k","a","r","t","h","i","k"};
////Assignment 2: Write a java program to sort a String Array.
		int i=0;
		while(i<a.length) {
			int j=i+1;
			while(j<a.length) {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j+=1;
			}
			i+=1;
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
	}

}
