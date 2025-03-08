/*1.Write a Java program to check whether a given string ends with another string.
*/
package NOV28.PracticeSession;

import java.util.Scanner;

public class CheckStringEndsWithAnotherString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.print("Enter your String: ");
        String f = sc.next();
        if(a[a.length-1].equals(f)) System.out.print("True");
        else System.out.println("false");

    }
}
