package NOV9.TejasSir;

import java.util.Scanner;

public class CheckPalindromeStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");

        StringBuffer sb = new StringBuffer(sc.nextLine());
        String a = sb.toString();
        StringBuffer str = sb.reverse();
        String s =str.toString();
        if(s.equals(a)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }
    }
}
