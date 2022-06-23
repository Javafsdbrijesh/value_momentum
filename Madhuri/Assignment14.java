
public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="valuemomentum";
		String sub=s.substring(6, 11);
		System.out.println(sub);

	}

}
/*String s="valuemoentum"
 * value[]={v,a,l,u,e,m,o,m,e,n,t,u,m}
 * count=12
 * offset=0
 * 
 * but when it comes to substring different object is created
 * the value[] char array will be shared among two String objects
 * sub="oment"
 * value[]={v,a,l,u,e,m,o,m,e,n,t,u,m}
 * count=5
 * offset=6
 */
/*
 * Memory leak
 * When we call substring(), a new String object is created in memory.
 *  But still it refers the char[] array value from original String.
 *  This prevents main String s from Garbage collection process and we are unnecessarily 
 *  storing 13 bytes in memory.
 */





