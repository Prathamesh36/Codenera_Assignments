package JAN24;

import java.util.Scanner;

public class CheckGivenStringIsPalindromeOrNotUsingRecursion {

    public static boolean isPali(String s){
        if(s.length()==1 ) return true;
        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
        return isPali(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        if(isPali(s)) System.out.println("Given String is Palindrome");
        else System.out.println("Given String is Not Palindrome");
    }
}
