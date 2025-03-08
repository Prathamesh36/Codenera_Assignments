package JAN30;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNotUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString())) System.out.println("String is Palindrome");
        else System.out.println("String is Not Palindrome");
    }
}
