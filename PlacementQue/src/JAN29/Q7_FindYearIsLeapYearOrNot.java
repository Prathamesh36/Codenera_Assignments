/*7) Develop a program that checks if a given year is a leap year. If it is a leap year,
find the sum of its digits; otherwise, find the product of its digits.
*/
package JAN29;

import java.util.Scanner;

public class Q7_FindYearIsLeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int n = sc.nextInt();
        if(n%4==0 || n%100==0 && n%400==0){
            int sum=0;
            for (int i = n; i!=0 ; i=i/10) {
                int rem=i%10;
                sum+=rem;
            }
            System.out.println("Number is leap year | sum of digits: "+sum);
        }
        else{
            int pro=1;
            for (int i = n; i!=0 ; i=i/10) {
                int rem=i%10;
                pro+=rem;
            }
            System.out.println("Number is not leap year | product of digits: "+pro);
        }
    }
}
