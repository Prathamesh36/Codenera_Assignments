package DEC1;

@FunctionalInterface

interface Demo
{
    public void disp();

}

public class CreateLambdaCheckStringEmptyOrNot
{

    public static void main(String[] args)
    {
        Demo ob=()->
        {
            String name = "Prathamesh";
            System.out.println(name);
            System.out.println(name.isEmpty());
        };
        ob.disp();

    }

}