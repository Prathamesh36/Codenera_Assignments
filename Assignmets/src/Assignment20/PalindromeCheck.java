/*Q13.Write a program to check palindrome number with return type with arg.*/
package Assignment20;

import java.util.Scanner;

public class PalindromeCheck {

    public String check(int n){
        int res=0;
        int rem;
        for(int i=n;i!=0;i=i/10){
            rem = i%10;
            res = (res*10)+rem;
        }
        if(res==n){
            return "Given number is palindrome";
        }
        return "Given number is not palindrome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        PalindromeCheck ob = new PalindromeCheck();

        System.out.print(ob.check(n));
    }
}
/***********************OUTPUT**************************
 Enter your number: 12321
 Given number is palindrome
 *******************************************************/