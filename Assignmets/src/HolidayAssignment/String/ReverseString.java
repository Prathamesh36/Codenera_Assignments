/*20.	Write a function to reverse a string without using any built-in string reversal functions.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String a="";
        System.out.print("Reverse String: ");
        for (int i = s.length()-1; i >=0 ; i--) {
            a+=s.charAt(i);
        }
        System.out.print("Reverse String: "+a);
    }
}
/************************OUTPUT****************************
 Enter your String: Codenera
 Reverse String: Reverse String: arenedoC
 *********************************************************/