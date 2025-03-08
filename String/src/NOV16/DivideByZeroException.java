package NOV16;

import java.util.Scanner;

public class DivideByZeroException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();

        try{
            int div = a/b;
        }
        catch (Exception e){
            System.out.println("Invalid Input....");
        }


    }
}
