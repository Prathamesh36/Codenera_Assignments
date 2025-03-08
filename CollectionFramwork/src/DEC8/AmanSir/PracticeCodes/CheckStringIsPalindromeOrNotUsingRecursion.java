package DEC8.AmanSir.PracticeCodes;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNotUsingRecursion {

    static boolean CheckPali(String a){
        char x=a.charAt(0);
        char y=a.charAt(a.length()-1);
        if(a.length()==1 ){
            return true;
        }
        if(x!=y) return false;
        return CheckPali(a.substring(1,a.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String n = sc.next();
        System.out.println("String Palindrome or not: "+CheckPali(n));

    }
}
