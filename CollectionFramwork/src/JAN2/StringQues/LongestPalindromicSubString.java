/*5. Write a Java program that accepts a string as input and finds the longest palindrome substring
using the StringBuffer class. A palindrome substring is a substring that reads the same forward and
backward. For example, if the input string is "babad", the output should be "bab" or "aba".*/
package JAN2.StringQues;

import java.util.Scanner;

public class LongestPalindromicSubString {

    public static boolean isPali(String s, int j, int k) {
        while(j<k){
            if (s.charAt(j) != s.charAt(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        int max = 0, start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPali(s, i, j)) {
                    if ((j-i+1) > max) {
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Longest Palindromic subString: "+longestPalindrome(s));
    }
}
