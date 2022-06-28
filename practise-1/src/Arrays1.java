public class Arrays1 {
public static void main(String args[])
{
int [][][]a= {{{10,20,30},{40,50},{60}},{{70,80},{90,100},{110}}};
//3D Array
//For each
for(int[] []i:a)
{
for(int[]j:i)
{
for(int k:j) {
System.out.println(k);
}
}

}
}



}