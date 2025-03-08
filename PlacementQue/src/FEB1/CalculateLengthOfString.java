/*1. Write a Java program to calculate the length of a string.
*/
package FEB1;

import java.util.Scanner;

public class CalculateLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.println("Length of String: "+s.length());
    }
}
/**********************OUTPUT***************************
 Enter your String: Codenera
 Length of String: 8
********************************************************/