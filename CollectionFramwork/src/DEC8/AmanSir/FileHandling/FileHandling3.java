package DEC8.AmanSir.FileHandling;

import java.io.File;

public class FileHandling3
{

    public static void main(String[] args)
    {
        try
        {
            File f=new File("F://fileHandling/data.txt");

            if(f.delete())
            {
                System.out.println("Your file is deleted Successfully");
            }
            else
            {
                System.out.println("Something went wrong please try again");
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}