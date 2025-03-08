package NOV16;

import java.util.Scanner;

public class ParseIntException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            System.out.print("Enter Your String: ");
            String b = sc.next();
            int a = Integer.parseInt(b);
            System.out.println(a);
        }
        catch (NumberFormatException e){
            System.out.print("Cannot Convert String into integer");
        }

    }
}
