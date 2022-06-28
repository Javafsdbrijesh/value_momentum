//Assignment 5:- write a java program to test if an array contains a specific value.
Import java.util.sream.IntStream;
Class Main
{
public static void main(String  []args)
{
Int[] num = { 1, 2, 3, 4, 5};
Int tofind = 4;
Boolean found = IntStream.of(num).anyMatch(n -> n == tofind);
If(found)
   System.out.println(tofind + “ is  found”);
else
      System.out.println(tofind + “ is not found”);
}
}
