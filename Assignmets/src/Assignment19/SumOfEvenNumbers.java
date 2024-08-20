/*Q8.Write a program to find sum of all even numbers between 1 to n using inheritence..*/
package Assignment19;

import java.util.Scanner;

class sum1{
    int n ;
    sum1(int n){
        this.n=n;
    }
    public void natural(){
        System.out.print("Sum of even natural numbers is: ");
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sum1 ob = new sum1(n);
        ob.natural();

    }
}
/*********************OUTPUT************************
 Enter number: 10
 Sum of even natural numbers is: 30
 ****************************************************/