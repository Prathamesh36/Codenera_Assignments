package DEC8.AmanSir.FileHandling;


import java.io.File;
import java.util.Scanner;

public class FileHandling4
{

    public static void main(String[] args)
    {
        String a="";
        try
        {
            File f=new File("F://fileHandling/data.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                a=sc.nextLine();
                System.out.println(a);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Content in uppercase");
        System.out.println(a.toUpperCase());

    }

}