package NOV7.AmanSir;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Output: ");
        String rev ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }
    }
}
