/*Q6.Count primes that can be expressed as sum of two consecutive primes and 1

Input: N = 27
Output: 2
13 = 5 + 7 + 1 and 19 = 7 + 11 + 1 are the required prime numbers.
Input: N = 34
Output: 3
13 = 5 + 7 + 1, 19 = 7 + 11 + 1 and 31 = 13 + 17 + 1. */
package Test0;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfConsecutivePrimesAnd1 {

    public boolean isPrime(int a){
        int c=0;
        for(int j=2;j<a;j++){
            if(a%j==0){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n= sc.nextInt();
        int count=0;
        int b[]= new int[n];
        int x =0;
        for(int i=2;i<n;i++){
            count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                b[x]=i;
                x++;
            }
       }


        SumOfConsecutivePrimesAnd1 ob = new SumOfConsecutivePrimesAnd1();
        int c=0;
        for(int i=1;i<b.length;i++){
            if(b[i]!=0) {
                int num = b[i - 1] + b[i] + 1;

                if (ob.isPrime(num) && num<n) {
                    c++;

                }
            }
        }

        System.out.print("Output: " + c);

    }
}
