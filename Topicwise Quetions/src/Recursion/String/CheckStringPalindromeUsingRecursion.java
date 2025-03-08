package Recursion.String;

import java.util.Scanner;

public class CheckStringPalindromeUsingRecursion {

    //method 1
    public static String reverse(String s){
        if(s.length()==0) return "";
        return reverse(s.substring(1))+s.charAt(0);
    }

    //method 2
    public static boolean isPalindrome(String s){
        if(s.length()==1) return true;
        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1,s.length()-1));
    }

    //method 3
    public static boolean isPalindrome2(String s){
        if(s.length()==1) return true;
        return ((s.charAt(0)==s.charAt(s.length()-1) && isPalindrome2(s.substring(1,s.length()-1))));
    }

    //method 4
    public static boolean isPalindrome3(String s,int l,int r){
        if(l ==r ) return true;
        return ((s.charAt(l)==s.charAt(r) && isPalindrome3(s,l+1,r-1)));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(s.equals(reverse(s))) {
            System.out.printf("%s is Palindrome",s);
        }
        else{
            System.out.printf("%s is not Palindrome",s);
        }

        /********************************************/
        System.out.println("Method 2: ");
        System.out.println(isPalindrome(s));
        /********************************************/
        System.out.println("Method 3: ");
        System.out.println(isPalindrome2(s));
        /********************************************/
        int l=0;
        int r=s.length()-1;
        System.out.println("Method 4: ");
        System.out.println(isPalindrome3(s,l,r));

    }
}
