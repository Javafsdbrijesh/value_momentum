/*write a Java program to find the given number is amstrong or not.*/
public class Amstrongnum {



    public static void main(String[] args) {



        int num = 153, number, temp, total = 0;

        number = num;

       

        while (number != 0)

        {

            temp = number % 10;

            total = total + temp*temp*temp;

            number /= 10;

        }



        if(total == num)

            System.out.println(num + " is an Armstrong number");

        else

            System.out.println(num + " is not an Armstrong number");

    }

}