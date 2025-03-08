/*4. Write a Java program that accepts a string as input and checks if it is a palindrome using the
StringBuffer class. A palindrome is a word, phrase, number, or other sequence of characters that reads
the same forward and backward. For example, if the input string is "racecar", the output should be "Palindrome".
*/
package JAN2.StringQues;

import java.util.Scanner;

public class CheckStringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.print("Output: ");
        String rev = String.valueOf(sb.reverse());
        if(s.equals(rev)){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}
