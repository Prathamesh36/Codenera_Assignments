/*2) WAP to check the Plaindrom String using StringBuffer class? */
package Assignment31;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        if(a.equals(sb.toString())){
            System.out.println("String is Palindrome");
        }
        else System.out.println("String is Not Palindrome");
    }
}
/***************************OUTPUT*******************************
 Enter String 1: level
 String is Palindrome
 *****************************************************************/
