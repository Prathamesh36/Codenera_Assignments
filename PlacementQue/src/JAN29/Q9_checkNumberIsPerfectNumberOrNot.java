/*9) Create a program that accepts a positive integer and checks if it is a perfect number.
 If it is perfect, find the sum of its divisors; otherwise, find the product of its divisors.
*/
package JAN29;

import java.util.Scanner;

public class Q9_checkNumberIsPerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Given Number is Perfect number");
            System.out.println("Sum of Divisors: "+sum);
        }

        else{

            int pro=1;
            for (int i = 1; i <n ; i++) {
                if(n%i==0){
                    pro*=i;
                }
            }
            System.out.println("Given Number is not Perfect number");
            System.out.println("product of Divisors: "+pro);
        }
    }
}
