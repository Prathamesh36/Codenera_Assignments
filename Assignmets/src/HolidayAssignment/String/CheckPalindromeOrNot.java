/*21.	Write a function to check if a string is a palindrome (reads the same forward and backward).*/
package HolidayAssignment.String;

import java.util.Scanner;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String a="";
        for (int i = s.length()-1; i >=0 ; i--) {
            a+=s.charAt(i);
        }
        if(a.equals(s)){
            System.out.print("String is Palindrome");
        }
        else {
            System.out.print("String is not palindrome");
        }
    }
}
/************************OUTPUT****************************
 Enter your String: level
 String is Palindrome
 *********************************************************/