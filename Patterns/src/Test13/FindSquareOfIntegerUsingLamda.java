/*Q1.Write a lambda expression to find the square of a given integer.*/
package Test13;

import java.util.Scanner;

public class FindSquareOfIntegerUsingLamda {

    interface  Square{
        int calculate(int a);
    }

    public static void main(String[] args) {
        Square ob = (int a)->a*a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        System.out.print("Square is: "+ob.calculate(n));
    }
}
/************************OUTPUT*************************
 Enter Number: 5
 Square is: 25
********************************************************/