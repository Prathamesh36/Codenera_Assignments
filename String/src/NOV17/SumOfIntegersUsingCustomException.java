package NOV17;

import java.util.Scanner;

class ThresholdExceededException extends RuntimeException
{
    ThresholdExceededException()
    {
        super("Sum is greater than 100 Sorry...");
    }

}

public class SumOfIntegersUsingCustomException
{
    Scanner sc=new Scanner(System.in);

    public void check()
    {
        System.out.println("enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a+b;


        if(sum>100)
        {
            throw new ThresholdExceededException();
        }
        else
        {
            System.out.println("Congratulations!! sum is less than 100..");
        }

    }

    public static void main(String[] args)
    {
        SumOfIntegersUsingCustomException ob=new SumOfIntegersUsingCustomException();
        try
        {
            ob.check();
        }
        catch (RuntimeException e)
        {
            System.out.println("Error..."+e);
        }

    }

}