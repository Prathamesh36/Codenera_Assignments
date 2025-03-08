package DEC8.AmanSir.FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            FileWriter fw=new FileWriter("F://fileHandling/data.txt");
            System.out.println("Enter file content:");
            String s=sc.nextLine();
            fw.write(s);
            fw.close();
            System.out.println("Content written successfully:");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

}