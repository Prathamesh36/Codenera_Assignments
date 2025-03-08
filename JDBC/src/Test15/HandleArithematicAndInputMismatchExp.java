/*Q11.
Write a Java program that divides two integers provided by the user. Handle the ArithmeticException
that may occur if the second integer is zero and display an error message indicating division by zero. Additionally,
 handle the InputMismatchException that may occur if the user enters a non-integer input and display a custom error
 message for invalid input.*/
package Test15;

import java.util.Scanner;
import java.util.InputMismatchException;

public class HandleArithematicAndInputMismatchExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter 1st Number: ");
            int n = sc.nextInt();
            System.out.print("Enter 2nd Number:");
            int m = sc.nextInt();
            if(m==0){
                throw new ArithmeticException("Error: Division by zero");
            }
            int ans = n/m;
            System.out.print("Result: "+ans);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*****************************OUTPUT******************************
 Enter 1st Number: 5
 Enter 2nd Number:0
 Error: Division by zero

 Enter 1st Number: a
 Error: Please enter valid integers only.
 ******************************************************************/