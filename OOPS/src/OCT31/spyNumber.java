/*Q4.10) Spy Number in Java
    A positive integer is called a spy number if the sum and product of its digits are equal. In other words,
     a number whose sum and product of all digits are equal is called a spy number.
       n=1124
   Sum=1+1+2+4=8
   Product=1*1*2*4=8*/
package OCT31;

import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        int sum=0;
        int mul=1;

        for (int i = k; i!=0; i=i/10) {
            int rem=i%10;
            sum+=rem;
            mul=mul*rem;

        }

        if(mul==sum) {
            System.out.print("Given number is Spy number ");
        }
        else {
            System.out.print("Given number is not Spy number");
        }
    }
}
