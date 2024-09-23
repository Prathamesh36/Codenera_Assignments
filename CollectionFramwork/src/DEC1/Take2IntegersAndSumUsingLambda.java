package DEC1;

import java.util.Scanner;

interface Sum
{
    public int disp(int a,int b);

}

public class Take2IntegersAndSumUsingLambda {



        public static void main(String[] args)
        {
            Sum ob=(a,b)->
            {
                int sum = a+b;
                return sum;
            };
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Sum: "+ob.disp(a,b));

        }

}

