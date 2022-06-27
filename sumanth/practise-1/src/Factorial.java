/*Write a Java program to print factorial of a given number*/



class Factorial {

public static void main(String args[])

{

  int i=1,fact=1,num=5;

        while(i<=num)

        {

            fact=fact*i;

            i++;

        }

        System.out.println("Factorial of the number: "+fact); 

}

}

