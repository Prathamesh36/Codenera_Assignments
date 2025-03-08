/*Q6.Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much

Output: much.very.program.this.like.i

Explanation: After reversing the whole
string(not individual words), the input

string becomes

much.very.program.this.like.i*/
package Test10;

import java.util.Scanner;

public class ReverseStringWithoutReversingWords {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        String[] a = str.split("\\.");
        StringBuilder sb= new StringBuilder();
        for (int i = a.length-1; i >=0; i--) {
            sb.append(a[i]);
            if (i != 0) sb.append(".");
        }
        System.out.print("OUTPUT: "+sb);
    }
}
/************************OUTPUT*****************************
 Enter your string: i.like.this.program.very.much
 OUTPUT: much.very.program.this.like.i
 ************************************************************/