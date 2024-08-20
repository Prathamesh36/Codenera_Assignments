/*Q7.Write a program to find sum of all natural numbers between 1 to n using inheritence..*/
package Assignment19;

import java.util.Scanner;

class sum{
    int n ;
    sum(int n){
        this.n=n;
    }
    public void natural(){
        System.out.print("Sum is: ");
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sum ob = new sum(n);
        ob.natural();

    }
}
/*********************OUTPUT************************
 Enter number: 10
 Sum is: 55
 ****************************************************/