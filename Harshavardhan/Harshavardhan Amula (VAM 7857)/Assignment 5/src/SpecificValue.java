
public class SpecificValue {
	public static boolean contains(int[] Array,int num) {
		for(int arrElement : Array) {
			if(num == arrElement) {
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args) {
		int[] test=new int[]{2,4,6,8,10,12,14,16};
		System.out.println(contains(test, 12));
		
	}
}
