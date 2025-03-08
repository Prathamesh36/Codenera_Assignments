/*Write a function to check if a string is a palindrome (reads the same forward and backward).*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q2_CheckStringPalindromeOrNot {
    public static boolean isPali(String s){
        if(s.length()==1) return true;
        return ((s.charAt(0)==s.charAt(s.length()-1) && isPali(s.substring(1,s.length()-1))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        if(isPali(s)) System.out.printf("%s is Palindrome String",s);
        else System.out.printf("%s is not Palindrome String",s);

    }
}
/*******************************OUTPUT********************************
 Enter your String: level
 level is Palindrome String

 Enter your String: leval
 leval is not Palindrome String
 **********************************************************************/