/*Q.8  WAP to check the Palindrom String or not using StringBuffer class? */
package Test12;

import java.util.Scanner;

public class CheckPalindromUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String a = sc.next();
        StringBuffer sb = new StringBuffer(a);
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
