/*Q9.Write a program to find sum of all odd numbers between 1 to n using inheritence..*/
package Assignment19;

import java.util.Scanner;

class odd{
    int n ;
    odd(int n){
        this.n=n;
    }
    public void natural(){
        System.out.print("Sum of odd natural numbers is: ");
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        odd ob = new odd(n);
        ob.natural();

    }
}
/*********************OUTPUT************************
 Enter number: 10
 Sum of even natural numbers is: 30
 ****************************************************/