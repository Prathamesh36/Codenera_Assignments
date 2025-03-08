package NOV10;

import java.util.Scanner;

public class StringBuilderPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String a = sb.toString();
        StringBuilder str = sb.reverse();
        String s =str.toString();
        if(s.equals(a)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }
    }

}
