/*1)Write a program to print the words from String(Sentence).
*/
package NOV29.PracticeSession.String;

import java.util.Scanner;

public class PrintWordFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
