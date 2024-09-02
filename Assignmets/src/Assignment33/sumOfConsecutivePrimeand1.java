/*/*5. Count triplets such that sum of any two number is equal to third

Input: arr[] = {1, 5, 3, 2}
Output: 2
Explanation:
In the given array, there are two such triplets such that sum of the two numbers is equal to the third number, those are –
(1, 2, 3), (3, 2, 5)*/
package Assignment33;

import java.util.Scanner;

public class sumOfConsecutivePrimeand1 {
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


        sumOfConsecutivePrimeand1 ob = new sumOfConsecutivePrimeand1();
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
/**********************OUTPUT************************
 Enter your Number: 34
 Output: 3
 *****************************************************/