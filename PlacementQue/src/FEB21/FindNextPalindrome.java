/*2) Have the function NextPalindrome(num) take the num parameter being passed and return the next
palindromic number. The input can be any positive integer. For example: if num is 24, then your
program should return 33 because that is the next largest number that is a palindrome*/
package FEB21;

import java.util.Scanner;

public class FindNextPalindrome {

    static boolean isPali(int a){
        int res=0;
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            res=(res*10)+rem;
        }
        if(a==res){
            return true;
        }
        return false;
    }
    public static int NextPalindrome(int n){
        while(!isPali(n)){
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Next Larger Palindrome Number: "+NextPalindrome(n));

    }
}
