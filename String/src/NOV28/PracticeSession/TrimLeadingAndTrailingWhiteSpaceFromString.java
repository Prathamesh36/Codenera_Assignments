/*5.Write a Java program to trim leading or trailing whitespace from a given string.
*/
package NOV28.PracticeSession;

import java.util.Scanner;

public class TrimLeadingAndTrailingWhiteSpaceFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        System.out.print("OUTPUT: "+s.trim());

    }
}
