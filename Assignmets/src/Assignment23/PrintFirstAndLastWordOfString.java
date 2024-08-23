/*Q1. WAP to print the first and last word of String*/
package Assignment23;

import java.util.Scanner;

public class PrintFirstAndLastWordOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("First character of String: ");
        System.out.print(a[0]);
        System.out.print("\nLast character of String: ");
        System.out.print(a[a.length-1]);
    }
}
/*********************OUTPUT************************
 Enter your String: I am From Pune
 First character of String: I
 Last character of String: Pune
 ****************************************************/