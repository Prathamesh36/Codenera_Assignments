package NOV16.AmanSir;


import java.util.Scanner;

class AgeNotFound extends RuntimeException
{
    AgeNotFound()
    {
        super("you are not eligible for voting ..");
    }

}

public class throwKeyword
{
    Scanner sc=new Scanner(System.in);

    public void checkvoting()
    {
        System.out.println("enter your age: ");
        int age=sc.nextInt();

        if(age<18)
        {
            throw new AgeNotFound();
        }
        else
        {
            System.out.println("Congratulations!! you are eligible for voting...");
        }

    }

    public static void main(String[] args)
    {
        throwKeyword ob=new throwKeyword();
        try
        {
            ob.checkvoting();
        }
        catch (RuntimeException e)
        {
            System.out.println("your age is not completed.."+e);
        }

    }

}
