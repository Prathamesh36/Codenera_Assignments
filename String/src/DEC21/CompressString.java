/*Q13. Easy string (google)
Example 1:
Input: S = "aaABBb"
Output: "3a3b"
Explanation: As 'a' appears 3 times
consecutively and 'b' also 3 times,
and 'b' and 'B' considered as same.
Example 2:
Input: S = "aaacca"
Output: "3a2c1a"
Explanation: As 'a' appears 3 times
consecutively and 'c' also 2 times,
and then 'a' 1 time.*/
package DEC21;

import java.util.Locale;
import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String w = sc.next();
        int count=0;
        int f=0;
        int f1=0;
        String sb ="";
        String n=w.toLowerCase();
        while (f1 < n.length()) {
            if (n.charAt(f)== n.charAt(f1)) {
                count++;
                f1++;
            } else if (n.charAt(f) != n.charAt(f1)) {

                sb+=n.charAt(f);
                sb+=count;
                count = 0;
                f = f1;
            }
            if (f1 == n.length()) {
                sb+=count;
                sb+=n.charAt(f);

            }
        }
        System.out.print("OUTPUT: " + sb);
    }
}
