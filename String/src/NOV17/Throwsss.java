package NOV17;

public class Throwsss
{



    public void disp() throws InterruptedException
    {
        for (int i = 0; i <=10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Throwsss ob1=new Throwsss();

        try
        {
            ob1.disp();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }



    }

}