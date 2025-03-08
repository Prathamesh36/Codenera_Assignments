/*65. Write a program that takes in a string and returns the length of the longest substring
that is a palindrome.*/
package NOV22.PracticeSession;

import java.util.Scanner;

public class LengthOfSubStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String r = sc.nextLine();
        String[] a= r.split(" ");
        int max=0;
        for (int j= 0; j < a.length; j++) {
            char ch[] = a[j].toCharArray();
            StringBuilder rev= new StringBuilder();
            for (int i = ch.length-1; i >=0 ; i--) {
                rev.append(ch[i]);
            }
            if(rev.toString().equals(a[j])){
                if(a[j].length()>max){
                    max=a[j].length();
                }
            }
        }
        System.out.print("Length of Longest SubString that is Palindrome is: "+max);
    }
}
