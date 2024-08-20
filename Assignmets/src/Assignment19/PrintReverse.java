/*Q5.Write a program to print all natural numbers in reverse (from n to 1). - using class and object.*/
package Assignment19;

import java.util.Scanner;

class reverse{
    int n ;
    reverse(int n){
        this.n=n;
    }
    public void reverse1(){
        System.out.print("Reverse: ");
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        reverse ob = new reverse(n);
        ob.reverse1();

    }
}
/*********************OUTPUT************************
 Enter number: 7
 Reverse: 7 6 5 4 3 2 1
 ****************************************************/