public class Arrays4 {

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
//Basic loop
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++) {
System.out.println(a[i][j]);

}
}



}
}