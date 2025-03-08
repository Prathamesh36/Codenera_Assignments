import java.util.Scanner;

public class CustomeException extends Exception{
    CustomeException(String str ){
        super(str);
    }

    public static void main(String[] args) throws CustomeException{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age =sc.nextInt();
        try {


        if(age<18) {
            throw new CustomeException("invalid input ");
        }
        else{
            System.out.println("yes you can vote");
        }
        }
        catch(Exception e ){
            System.out.println(e);
        }
        System.out.println("Done!!");
    }
}
