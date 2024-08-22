/*Q10.Wap input an integer and check it is neon no or not.
(neon no=>A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.).*/
package Assignment20;

import java.util.Scanner;

abstract class Neon{
    abstract void Number(int a);
}
class Neon1 extends Neon{
    public void Number(int k){
        int fact=0;
        int ans = k*k;
        for (int i = ans; i!=0; i=i/10) {
            int rem=i%10;
            fact+=rem;
        }
        if(fact==k) {
            System.out.print("Given number is neon number ");
        }
        else {
            System.out.print("Given number is not neon number");
        }
    }
}
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        Neon ob= new Neon1();
        ob.Number(k);

    }
}
/***********************OUTPUT**************************
 Enter your number: 9
 Given number is neon number
 *******************************************************/
