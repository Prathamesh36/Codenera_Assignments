/*Q5. Uncommon characters (Zoho)
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.*/
package DEC21;

import java.util.Arrays;
import java.util.Scanner;

public class StringQue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.next();
        System.out.print("Enter Your String: ");
        String b = sc.next();

        String c ="";
        for (int i = 0; i < a.length(); i++) {
            if(!b.contains(String.valueOf(a.charAt(i)))&& !c.contains(String.valueOf(a.charAt(i)))){
                c+=a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(!a.contains(String.valueOf(b.charAt(i)))&& !c.contains(String.valueOf(b.charAt(i)))){
                c+=b.charAt(i);
            }
        }
        char[] ch = c.toCharArray();
        Arrays.sort(ch);
        System.out.print("OUTPUT: "+ Arrays.toString(ch));


    }
}
