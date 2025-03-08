package DEC8.AmanSir.FileHandling;

import java.io.File;

public class FileHandling1
{

    public static void main(String[] args)
    {
        try
        {
            File f1=new File("F://fileHandling/data.txt");

            if(f1.createNewFile())
            {
                System.out.println("File is created");
            }
            else
            {
                System.out.println("This file is already present");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

}