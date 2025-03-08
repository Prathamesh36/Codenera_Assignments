package ThinkitiveTechPractive;

import java.util.Scanner;

public class longestPalindromeWordInString {

    public static boolean isPali(String s) {
        int j=0;
        int k=s.length()-1;
        while(j<k){
            if (s.charAt(j) != s.charAt(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }

    public static String checkLongestPaliInString(String s){
        int max=0;
        String ans ="";
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(isPali(a[i].toLowerCase()) && a[i].length()>max){
                max = a[i].length();
                ans = a[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: "+checkLongestPaliInString(s));
    }
}
