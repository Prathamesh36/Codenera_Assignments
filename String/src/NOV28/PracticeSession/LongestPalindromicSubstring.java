package NOV28.PracticeSession;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    boolean isPali(String s){
        String rev ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LongestPalindromicSubstring ob = new LongestPalindromicSubstring();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String a[] = s.split(" ");
        String ans ="";
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(ob.isPali(a[i]) && a[i].length()>max){
                max=a[i].length();
                ans=a[i];
            }
        }
        System.out.print("Longest Palindromic SubString is: "+ans);
    }
}
