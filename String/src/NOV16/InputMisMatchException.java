package NOV16;

import java.util.Scanner;

public class InputMisMatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            int a = sc.nextInt();
            System.out.print("Enter number: ");
            int b = sc.nextInt();
        }
        catch (Exception e){
            System.out.println();
            System.out.print("Enter Integer Value....");
        }
    }
}
