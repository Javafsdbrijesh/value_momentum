package advjava;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Sneha");
		StringBuffer sbf=new StringBuffer("7876");
		sb.replace(1,4,"hello");
		System.out.println(sb);
		sb.append("hello");
		System.out.println(sb);
		sb.delete(3,4);
		System.out.println(sb);
		sbf.replace(2,5,"Java");
		System.out.println(sbf);
		sbf.append("John");
		System.out.println(sbf);
		sbf.delete(4,6);
		System.out.println(sbf);

	}

}
