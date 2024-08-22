/*Q3.Write a program that prompts the user to input an integer and then outputs
   the number with the digits reversed.For example, if the input is 12345, the output should be 54321.*/
package Assignment20;

import java.util.Scanner;

abstract class Reverse{
    abstract void numbers(int a);
}
class reverse1 extends Reverse{
    public void numbers(int a){
        int res= 0;
        for(int i=a;i!=0;i=i/10){
           int rem = i%10;
           res=(res*10)+rem;
        }
        System.out.print("Reverse number is: "+res);
    }
}
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        Reverse ob= new reverse1();
        ob.numbers(n);
    }
}
/***********************OUTPUT**************************
 Enter your Number: 12345
 Reverse number is: 54321
 *******************************************************/
