/*WAP to check the number is Prime or not if the number is prime then find the sum of all number.
input: 11
output: it is prime number and sum=1+1=2*/
package Test0;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int s = sc.nextInt();
        int c=0;
        for(int i=2;i<s;i++){
            if(i%s==0){
                c++;
            }
        }
        int res =0;
        int sum =0;
        if(c==0){
            for(int i=s; i!=0;i=i/10){
                int rem = i%10;
                sum = sum + rem;
            }
        }
        System.out.print("Sum is: "+sum);
    }
}
