public class Arrays5 {
public static void main(String args[])
{
int[][]a=new int[2][];
a[0]=new int[2];
a[1]=new int[2];
a[0][0]=4;
a[0][1]=5;
a[1][0]=6;
a[1][1]=7;
//2D Array
//For each
for(int[]i:a) {
for(int j:i) {
System.out.println(j);
}
}
}



}