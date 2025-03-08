/*4) WAP to print the sum of last 3 digit of fabnnoci sequence if the sum is even
 then find the sum of the number
   input: 7 -> 0,1,1,2,3,5,8
   Output: 3+5+8=16, sum is even then sum_of_num=1+6=7
*/
package JAN29;

import java.util.Scanner;

public class Q4_SumOfLastThreeDigitsOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        int sum =0;
        for(int i=2;i<n;i++){
            n3=n1+n2;
            if(i>=n-3){
                sum+=n3;
            }
            n1=n2;
            n2=n3;
        }
        System.out.println("Sum of last three digits is: "+sum);
        int sum1 = 0;
        if(sum%2==0) {

            for (int i = sum; i != 0; i = i / 10) {
                int rem = i % 10;
                sum1 += rem;
            }
            System.out.println("sum is even then sum_of_num: "+sum1);
        }


    }
}
