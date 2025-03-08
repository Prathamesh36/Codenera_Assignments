/*1. Write a program that takes in a string and reverses it.*/
package NOV20;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String a="";
        for (int i = s.length()-1; i >=0 ; i--) {
            a+=s.charAt(i);
        }
        System.out.print("Reverse String: "+a);
    }
}
